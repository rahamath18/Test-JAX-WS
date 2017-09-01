JAX-WS Hello World Example – RPC Style
	1. Create a Web Service Endpoint Interface
	2. Create a Web Service Endpoint Implementation
	3. Create a Endpoint Publisher
	4. Test It
		http://localhost:9090/ws/hello?wsdl
		
	5. Java Web Service Client
	
	6.Java Web Service Client via wsimport tool
			Alternative, you can use “wsimport” tool to parse the published wsdl file, 
			and generate necessary client files (stub) to access the published web service.
			
			wsimport -keep http://localhost:9090/ws/hello?wsdl
	
	
