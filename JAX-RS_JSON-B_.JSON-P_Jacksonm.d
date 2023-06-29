### JAX-RS - Java API for RESTful Web Services 2.1 (JSR 370)

WebLogic 14.1.1 supports JAX-RS 2.1 (JSR 370) with Jersey 2.29 Reference Implementation [What's New in Oracle WebLogic Server](https://docs.oracle.com/en/middleware/standalone/weblogic-server/14.1.1.0/notes/whatsnew.html#GUID-30A3CB3A-9399-44E6-84FF-C5A2A5A3DBD4)

### JSON-B - Java API for JSON Binding 1.0 (JSR 367)

> JSON-Binding (JSON-B) is a standard binding layer for converting Java objects to or from JSON messages.

> Oracle WebLogic Server 14.1.1.0.0 supports the Java API for JSON Binding 1.0 (JSR 367) specification by including the JSR-367 reference implementation for use with applications deployed on a WebLogic Server instance. 

> JSON-B defines a default mapping algorithm for converting existing Java classes to JSON, while enabling developers to customize the mapping process through the use of Java annotations. For more information, see Java API for JSON Binding in Developing Applications for Oracle WebLogic Server. 

[Developing Applications for Oracle WebLogic Server](https://docs.oracle.com/en/middleware/standalone/weblogic-server/14.1.1.0/wlprg/java-api-json-binding.html#GUID-203F8D60-C2E9-4183-8357-00B8A289E3D9)

Reference implemnetaion is "Eclipse Yasson (RI)" [eclipse-ee4j/yasson: Eclipse Yasson project](https://github.com/eclipse-ee4j/yasson)



### JSON-P - Java API for JSON Processing 1.1 (JSR 374)

> Oracle WebLogic Server 14.1.1.0.0 supports the JSON P 1.1 specification at https://www.jcp.org/en/jsr/detail?id=374. The JSON Processing 1.1 specification is based on the javax.json API, which supports new features such as JSON Pointer, JSON Patch, and JSON Merge Patch. These features are used to retrieve, transform, or manipulate values in an object model. For more information, see New Features for JSON Processing in Developing Applications for Oracle WebLogic Server.

Reference implementation:

 - org.glassfish.javax.json-1.1

### Jackson

Jackson IS NOT a JSON-P nor JSON-B implementation

> Jackson has been known as "the Java JSON library" or "the best JSON parser for Java". Or simply as "JSON for Java".
>
> More than that, Jackson is a suite of data-processing tools for Java (and the JVM platform), including the flagship streaming JSON parser / generator library, matching data-binding library (POJOs to and from JSON) and additional data format modules to process data encoded in Avro, BSON, CBOR, CSV, Smile, (Java) Properties, Protobuf, TOML, XML or YAML; and even the large set of data format modules to support data types of widely used data types such as Guava, Joda, PCollections and many, many more (see below).
> 
> While the actual core components live under their own projects -- including the three core packages (streaming, databind, annotations); data format libraries; data type libraries; JAX-RS provider; and a miscellaneous set of other extension modules -- this project act as the central hub for linking all the pieces together.
> 
> A good companion to this README is the Jackson Project FAQ.

Jackson can be used as JAX-RS provider


> Jackson is a popular JSON parser for Java and can be integrated with JAX-RS using the jackson-jaxrs-providers multi-module project.

[rest - Configure Jackson as JSON Provider in JAX-RS 2.0 - Stack Overflow](https://stackoverflow.com/questions/18741954/configure-jackson-as-json-provider-in-jax-rs-2-0)

> You should only need to get the implementation jar Jackson JAX-RS provider, add that to your classpath, and it should work. Version 2.x uses SPI-based auto-registration, so that you do not need anything in web.xml.
