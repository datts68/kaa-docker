# Kaa open-source IoT platform


Kaa is a production-ready, multi-purpose middleware platform for building complete end-to-end IoT solutions, connected applications, and smart products. The Kaa platform provides an open, feature-rich toolkit for the IoT product development and thus dramatically reduces associated cost, risks, and time-to-market. For a quick start, Kaa offers a set of out-of-the-box enterprise-grade IoT features that can be easily plugged in and used to implement a large majority of the IoT use cases.

This repository forked from [kaaproject/kaa](https://github.com/kaaproject/kaa) v0.10.0

# Docker deployment

## Building Kaa server from source code
https://kaaproject.github.io/kaa/docs/v0.10.0/Administration-guide/System-installation/Building-Kaa-server-from-source-code/

You can use any Git client to fetch Kaa source code from the repository.
To download Kaa repository, run the command below.

`git clone git@github.com:datts68/kaa-docker.git`

To build Kaa node Debian/RPM packages, change the current directory after cloning.

`cd kaa`

And run the following command.

  - Debian: `mvn -P compile-gwt,mongo-dao,mariadb-dao clean install verify`

  - RPM: `mvn -P compile-gwt,mongo-dao,mariadb-dao,build-rpm clean install verify`

The Debian build will work correctly on both Linux and Windows operation systems, while the RPM build will only work on Linux with the RPM package manager installed.


For the mvn command, the build number and git commit variables are set to emulate Jenkins build variables that are substituted automatically on the build machine.


Add the `-DskipTests` suffix to the mvn command to skip execution of tests and speed up the build process.


## Single node installation
https://kaaproject.github.io/kaa/docs/v0.10.0/Administration-guide/System-installation/Docker-deployment/

### Build docker image
Use kaa-node.deb located in server/node/target/, or download Kaa debian package from the [your example](https://drive.google.com/file/d/1AkoA38gcmcwDbtFbhuiVXJClUcUanJ4M/view?usp=sharing) . Put the kaa-node.deb file in the server/containers/docker/ directory.

Run the following command from the server/containers/docker directory.

`docker build --build-arg setupfile=kaa-node.deb -t kaa-node:0.10.0 .`

Alternatively, you can run the following command.

`build.sh`

### To install a single node:

Get your public host by specifying the TRANSPORT_PUBLIC_INTERFACE parameter in the server/containers/docker/docker-compose-1-node/kaa-example.env file.

  - Linux / macOS: `ip route get 8.8.8.8 | awk '{print $NF; exit}'`

  - Windows: `netsh interface ip show address "Ethernet" | findstr "IP Address"`


Open any directory in the docker-compose-1-node directory.

`cd docker-compose-1-node/$SQL-NoSQL/`

The following SQL-NoSQL databases are available:
  - `mariadb-mongodb`
  - `mariadb-cassandra`
  - `postgresql-mongodb`
  - `postgresql-cassandra`

Run the following command:

`docker-compose up`

If you want to run Docker container as a daemon, run:

`docker-compose up -d`
