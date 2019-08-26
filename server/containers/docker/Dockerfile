FROM ubuntu:16.04
MAINTAINER KAA IoT PLATFORM <www.kaaproject.org>
ENV DEBIAN_FRONTEND noninteractive

RUN apt-get update && apt-get -yqq install \
		software-properties-common \
		python-software-properties \
		ca-certificates \
		netcat \
		nano \
		net-tools \
	&& apt-get clean \
	&& rm -rf /var/lib/apt/lists/*

## ORACLE JAVA 8 (auto-accept license)
COPY jdk-8u221-linux-x64.tar.gz .
RUN mkdir /opt/jdk
RUN tar -zxf jdk-8u221-linux-x64.tar.gz -C /opt/jdk
RUN update-alternatives --install /usr/bin/java java /opt/jdk/jdk1.8.0_221/bin/java 100
RUN update-alternatives --install /usr/bin/javac javac /opt/jdk/jdk1.8.0_221/bin/javac 100
RUN rm jdk-8u221-linux-x64.tar.gz

# Copy compiled/downloaded Kaa .DEB file and install
ARG setupfile
COPY ["$setupfile", "/kaa-node.deb"]
RUN dpkg -i /kaa-node.deb \
	&& rm -R /kaa-node.deb \
	&& apt-get autoremove -y && apt-get clean

RUN touch /var/log/kaa/kaa-node.log \
	&& chown kaa:kaa /var/log/kaa/kaa-node.log

# Kaa service & convenience shell scripts
COPY kaa/ /kaa

EXPOSE 9090

ENTRYPOINT ["/kaa/docker-entry.sh"]