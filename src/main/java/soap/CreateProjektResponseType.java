/**
 * CreateProjektResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Das Antwort-Objekt der Projekt-Anlage.
 */
public class CreateProjektResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CreateProjektResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "CreateProjektResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projektNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    private String projektNr;
    private Integer id;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public CreateProjektResponseType() {
    }


    public CreateProjektResponseType(
            ResponseHeaderType responseHeader,
            String projektNr,
            Integer id) {
        this.responseHeader = responseHeader;
        this.projektNr = projektNr;
        this.id = id;
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
     * Gets the responseHeader value for this CreateProjektResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this CreateProjektResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the projektNr value for this CreateProjektResponseType.
     *
     * @return projektNr
     */
    public String getProjektNr() {
        return projektNr;
    }

    /**
     * Sets the projektNr value for this CreateProjektResponseType.
     *
     * @param projektNr
     */
    public void setProjektNr(String projektNr) {
        this.projektNr = projektNr;
    }

    /**
     * Gets the id value for this CreateProjektResponseType.
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this CreateProjektResponseType.
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreateProjektResponseType)) return false;
        CreateProjektResponseType other = (CreateProjektResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.responseHeader == null && other.getResponseHeader() == null) ||
                        (this.responseHeader != null &&
                                this.responseHeader.equals(other.getResponseHeader()))) &&
                ((this.projektNr == null && other.getProjektNr() == null) ||
                        (this.projektNr != null &&
                                this.projektNr.equals(other.getProjektNr()))) &&
                ((this.id == null && other.getId() == null) ||
                        (this.id != null &&
                                this.id.equals(other.getId())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getResponseHeader() != null) {
            _hashCode += getResponseHeader().hashCode();
        }
        if (getProjektNr() != null) {
            _hashCode += getProjektNr().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
