FROM jetty

COPY build/libs/latis-nds.war /var/lib/jetty/webapps
