﻿# A simple java EE 7 project

## Requirements
- JDK 8
- Maven
- Wildfly

# To compile
> mvn clean package

# To run
- Copy example-ear/target/exampleapp.ear to WILDFLY_DIR/standalone/deployments
- Run WILDFLY_DIR/bin/standalone.[sh/bat]
- Open http://localhost:8080/example-web/
