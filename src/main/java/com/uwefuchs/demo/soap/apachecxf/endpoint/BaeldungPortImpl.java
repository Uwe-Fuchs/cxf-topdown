
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.uwefuchs.demo.soap.apachecxf.endpoint;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 3.1.16
 * 2018-10-02T20:35:30.513+02:00
 * Generated source version: 3.1.16
 * 
 */

@javax.jws.WebService(
                      serviceName = "BaeldungService",
                      portName = "BaeldungPort",
                      targetNamespace = "http://endpoint.apachecxf.soap.demo.uwefuchs.com/",
                      wsdlLocation = "file:/media/uwe/Daten/Development/Tutorials/ApacheCXF/baeldung.wsdl",
                      endpointInterface = "com.uwefuchs.demo.soap.apachecxf.endpoint.Baeldung")
                      
public class BaeldungPortImpl implements Baeldung {

    private static final Logger LOG = Logger.getLogger(BaeldungPortImpl.class.getName());

	private Map<Integer, Student> students = new LinkedHashMap<Integer, Student>();

    @Override
	public String hello(String name) {
		return "Hello " + name;
	}

	@Override
	public String helloStudent(Student student) {
		students.put(students.size() + 1, student);
		return "Hello " + student.getName();
	}

    /* (non-Javadoc)
     * @see com.uwefuchs.demo.soap.apachecxf.endpoint.Baeldung#getStudents()*
     */
    public com.uwefuchs.demo.soap.apachecxf.endpoint.StudentMap getStudents() { 
        LOG.info("Executing operation getStudents");
        try {
            com.uwefuchs.demo.soap.apachecxf.endpoint.StudentMap _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
