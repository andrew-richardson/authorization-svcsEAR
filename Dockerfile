FROM jboss/wildfly:latest
RUN /opt/jboss/wildfly/bin/add-user.sh admin admin01 --silent
COPY build/libs/authorization-svcsEAR-1.0.ear /opt/jboss/wildfly/standalone/deployments/authorization-svcs.ear
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0", "--debug"]
