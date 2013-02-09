it.datiaperti.osgi.http
=======================

Very simple example on how to use the Apache Felix Http Service 

You need to install the following bundles into your Apache Felix instance:

* Http Service (1.0.1)
* Apache Felix Http Whiteboard (2.0.4)

The example contains a single servlet that registers itself with its Activator. When called with its alias /hello it sends a "Hello World" message. 
