it.datiaperti.osgi.http
=======================

Very simple example on how to use the Apache Felix Http Service 

You need to install the following bundles into your Apache Felix instance:

* Http Service (1.0.1)
* Apache Felix Http Whiteboard (2.0.4)

The example contains a single servlet that registers itself with its Activator. You can call the servlet by its alias /hello for example

http://localhost:9080/hello

When called it sends a "Hello World" message response. 
