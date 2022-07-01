/**
 * DeleteProjektRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Parameter zum Löschen eines Projekts.
 */
public class DeleteProjektRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(DeleteProjektRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "DeleteProjektRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projektNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    private Integer id;
    /* Die Nummer des zu löschenden Projektes. */
    private String projektNr;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public DeleteProjektRequestType() {
    }


    public DeleteProjektRequestType(
            RequestHeaderType requestHeader,
            Integer id,
            String projektNr) {
        this.requestHeader = requestHeader;
        this.id = id;
        this.projektNr = projektNr;
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
     * Gets the requestHeader value for this DeleteProjektRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this DeleteProjektRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the id value for this DeleteProjektRequestType.
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this DeleteProjektRequestType.
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the projektNr value for this DeleteProjektRequestType.
     *
     * @return projektNr   * Die Nummer des zu löschenden Projektes.
     */
    public String getProjektNr() {
        return projektNr;
    }

    /**
     * Sets the projektNr value for this DeleteProjektRequestType.
     *
     * @param projektNr   * Die Nummer des zu löschenden Projektes.
     */
    public void setProjektNr(String projektNr) {
        this.projektNr = projektNr;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DeleteProjektRequestType)) return false;
        DeleteProjektRequestType other = (DeleteProjektRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.requestHeader == null && other.getRequestHeader() == null) ||
                        (this.requestHeader != null &&
                                this.requestHeader.equals(other.getRequestHeader()))) &&
                ((this.id == null && other.getId() == null) ||
                        (this.id != null &&
                                this.id.equals(other.getId()))) &&
                ((this.projektNr == null && other.getProjektNr() == null) ||
                        (this.projektNr != null &&
                                this.projektNr.equals(other.getProjektNr())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRequestHeader() != null) {
            _hashCode += getRequestHeader().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getProjektNr() != null) {
            _hashCode += getProjektNr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
