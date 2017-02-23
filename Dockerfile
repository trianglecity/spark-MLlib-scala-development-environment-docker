FROM ubuntu:16.04

RUN	apt-get update

RUN	apt-get install -y software-properties-common && \
	apt-get install -y python-software-properties && \
	apt-get install -y default-jdk 

RUN	apt-get install -y maven
	
RUN 	apt-get install -y python3-pip

RUN	apt-get install -y libssl-dev && \
	apt-get install -y libffi-dev && \
	apt-get install -y python3-dev && \
	apt-get install -y python3-venv 

RUN	apt-get install -y curl && \
	apt-get install -y git && \
	apt-get install -y iptables && \
	apt-get install -y less && \
	apt-get install -y vim && \
	apt-get install -y vim-common && \
	apt-get install -y tar && \
	apt-get install -y zip && \
	apt-get install -y unzip

RUN	apt-get install -y build-essential && \
 	apt-get install -y apt-utils && \
	apt-get install -y automake && \
	apt-get install -y cmake && \
	apt-get install -y gcc && \
	apt-get install -y gcc-4.9 && \
	apt-get install -y g++ && \
	apt-get install -y g++-4.9 && \
	apt-get install -y gcc-multilib && \
	apt-get install -y libgomp1 && \
	apt-get install -y pkg-config && \
	apt-get install -y sphinx-common && \
	apt-get install -y gfortran && \
	apt-get install -y maven && \
	apt-get install -y libtool 

RUN	apt-get install -y wget && \
	mkdir protobuf_source && \
	cd protobuf_source && \
	wget https://github.com/google/protobuf/releases/download/v2.5.0/protobuf-2.5.0.tar.gz && \
	tar -zxvf ./protobuf-2.5.0.tar.gz && \
	cd protobuf-2.5.0 && \
        ./autogen.sh && \
	./configure && \
	make && \
	make install && \
	ldconfig && \
	cd .. && \
	cd ..
	

RUN	mkdir scala-2.11.8 && \ 	
	wget http://downloads.lightbend.com/scala/2.11.8/scala-2.11.8.tgz && \
	tar -zxvf ./scala-2.11.8.tgz && \
	mkdir /usr/lib/scala && \
	cp -rp ./scala-2.11.8 /usr/lib/scala/ && \
	ln -s /usr/lib/scala/scala-2.11.8/bin/scala /usr/bin/scala && \
	ln -s /usr/lib/scala/scala-2.11.8/bin/scalac /usr/bin/scalac && \
	scala -version && \
	cd ..

RUN	apt-get install -y openssl && \
	apt-get install -y zlib1g-dev && \
	apt-get install -y linux-headers-generic
	

	
ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64



RUN 	apt-get install -y apt-transport-https && \
	echo "deb https://dl.bintray.com/sbt/debian /" |  tee -a /etc/apt/sources.list.d/sbt.list && \
	apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 2EE0EA64E40A89B84B2DF73499E82A75642AC823

RUN 	echo "deb http://cran.rstudio.com/bin/linux/ubuntu xenial/" | tee -a /etc/apt/sources.list && \
	gpg --keyserver keyserver.ubuntu.com --recv-key E084DAB9 && \
	gpg -a --export E084DAB9 | apt-key add - && \
	apt-get update && \
	apt-get install -y r-base r-base-dev && \
	apt-get install -y sbt

RUN echo 'alias python="/usr/bin/python3"' >> ~/.bashrc

RUN 	echo "... wait for a while for sbt ..." && \
	sbt -version

RUN	mkdir findbugs_source && \
	cd findbugs_source && \
	wget https://sourceforge.net/projects/findbugs/files/findbugs/3.0.1/findbugs-3.0.1.tar.gz && \
	tar -zxvf findbugs-3.0.1.tar.gz && \
	cp -rp ./findbugs-3.0.1  /usr/share && \
	cd ..
	
	
ENV 	FINDBUGS_HOME /usr/share/findbugs-3.0.1

RUN	wget http://www-us.apache.org/dist/hadoop/common/hadoop-2.7.3/hadoop-2.7.3-src.tar.gz && \
	tar -zxvf ./hadoop-2.7.3-src.tar.gz && \
	cd hadoop-2.7.3-src && \
	mvn install -DskipTests && \
	mvn package -Pdist,native,docs,src -DskipTests -Dtar && \
	mvn install -DskipTests && \
	cd ..
	

	
	

	


	

	






