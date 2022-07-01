/**
 * ResponseHeaderType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Allgemeiner Antwort-Header, der in jeder Response mitgeliefert
 * wird und Informationen zur Request-Ausführung enthält.
 */
public class ResponseHeaderType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ResponseHeaderType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Die Versionsnummer der SOAP Schnittstelle. */
    private String version;
    /* Der Fehlercode der Request-Ausführung. 0 falls kein Fehler. */
    private String returnCode;
    /* Eine Fehlermeldung oder Information der Request-Ausführung. */
    private String message;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ResponseHeaderType() {
    }


    public ResponseHeaderType(
            String version,
            String returnCode,
            String message) {
        this.version = version;
        this.returnCode = returnCode;
        this.message = message;
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Gets the version value for this ResponseHeaderType.
     *
     * @return version   * Die Versionsnummer der SOAP Schnittstelle.
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the version value for this ResponseHeaderType.
     *
     * @param version   * Die Versionsnummer der SOAP Schnittstelle.
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Gets the returnCode value for this ResponseHeaderType.
     *
     * @return returnCode   * Der Fehlercode der Request-Ausführung. 0 falls kein Fehler.
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the returnCode value for this ResponseHeaderType.
     *
     * @param returnCode   * Der Fehlercode der Request-Ausführung. 0 falls kein Fehler.
     */
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    /**
     * Gets the message value for this ResponseHeaderType.
     *
     * @return message   * Eine Fehlermeldung oder Information der Request-Ausführung.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the message value for this ResponseHeaderType.
     *
     * @param message   * Eine Fehlermeldung oder Information der Request-Ausführung.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ResponseHeaderType)) return false;
        ResponseHeaderType other = (ResponseHeaderType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.version == null && other.getVersion() == null) ||
                        (this.version != null &&
                                this.version.equals(other.getVersion()))) &&
                ((this.returnCode == null && other.getReturnCode() == null) ||
                        (this.returnCode != null &&
                                this.returnCode.equals(other.getReturnCode()))) &&
                ((this.message == null && other.getMessage() == null) ||
                        (this.message != null &&
                                this.message.equals(other.getMessage())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getReturnCode() != null) {
            _hashCode += getReturnCode().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
