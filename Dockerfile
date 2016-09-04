FROM jboss/wildfly:latest
USER root
RUN mkdir project
ADD . project
WORKDIR /opt/jboss/project
RUN ./gradlew clean build
RUN cp build/libs/authorization-svcsEAR-1.0.ear /opt/jboss/wildfly/standalone/deployments/authorization-svcs-1.0.ear
RUN /opt/jboss/wildfly/bin/add-user.sh admin admin01 --silent
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]