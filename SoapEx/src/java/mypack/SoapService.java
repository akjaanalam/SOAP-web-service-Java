/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author root
 */
@WebService(serviceName = "SoapService")
@Stateless()
public class SoapService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello User " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiply")
    public long multiply(@WebParam(name = "dig1") int dig1, @WebParam(name = "dig2") int dig2) {
        //TODO write your implementation code here:
       long dig=dig1*dig2;
        return dig;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addition")
    public int addition(@WebParam(name = "dig1") int dig1, @WebParam(name = "dig2") int dig2) {
        //TODO write your implementation code here:
        return dig1+dig2;
    }
}
