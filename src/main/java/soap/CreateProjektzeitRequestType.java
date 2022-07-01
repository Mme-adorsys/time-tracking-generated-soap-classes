/**
 * CreateProjektzeitRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Parameter zur Anlage einer neuen Zeitbuchung.
 */
public class CreateProjektzeitRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CreateProjektzeitRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "CreateProjektzeitRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projektzeit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektzeit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ProjektzeitType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* Die Daten der Zeitbuchung. */
    private ProjektzeitType projektzeit;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public CreateProjektzeitRequestType() {
    }


    public CreateProjektzeitRequestType(
            RequestHeaderType requestHeader,
            ProjektzeitType projektzeit) {
        this.requestHeader = requestHeader;
        this.projektzeit = projektzeit;
    }

    public CreateProjektzeitRequestType(ProjektzeitType projektzeitType) {
        this.projektzeit = projektzeitType;
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
     * Gets the requestHeader value for this CreateProjektzeitRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this CreateProjektzeitRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the projektzeit value for this CreateProjektzeitRequestType.
     *
     * @return projektzeit   * Die Daten der Zeitbuchung.
     */
    public ProjektzeitType getProjektzeit() {
        return projektzeit;
    }

    /**
     * Sets the projektzeit value for this CreateProjektzeitRequestType.
     *
     * @param projektzeit   * Die Daten der Zeitbuchung.
     */
    public void setProjektzeit(ProjektzeitType projektzeit) {
        this.projektzeit = projektzeit;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreateProjektzeitRequestType)) return false;
        CreateProjektzeitRequestType other = (CreateProjektzeitRequestType) obj;
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
                ((this.projektzeit == null && other.getProjektzeit() == null) ||
                        (this.projektzeit != null &&
                                this.projektzeit.equals(other.getProjektzeit())));
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
        if (getProjektzeit() != null) {
            _hashCode += getProjektzeit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
