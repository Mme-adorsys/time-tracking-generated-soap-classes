/**
 * CreateMahlzeitRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Request-Struktur zum Anlegen einer Mahlzeit.
 */
public class CreateMahlzeitRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CreateMahlzeitRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "CreateMahlzeitRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mahlzeit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mahlzeit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "MahlzeitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* Die Struktur mit den Daten der anzulegenden Mahlzeit. */
    private MahlzeitType mahlzeit;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public CreateMahlzeitRequestType() {
    }


    public CreateMahlzeitRequestType(
            RequestHeaderType requestHeader,
            MahlzeitType mahlzeit) {
        this.requestHeader = requestHeader;
        this.mahlzeit = mahlzeit;
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
     * Gets the requestHeader value for this CreateMahlzeitRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this CreateMahlzeitRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the mahlzeit value for this CreateMahlzeitRequestType.
     *
     * @return mahlzeit   * Die Struktur mit den Daten der anzulegenden Mahlzeit.
     */
    public MahlzeitType getMahlzeit() {
        return mahlzeit;
    }

    /**
     * Sets the mahlzeit value for this CreateMahlzeitRequestType.
     *
     * @param mahlzeit   * Die Struktur mit den Daten der anzulegenden Mahlzeit.
     */
    public void setMahlzeit(MahlzeitType mahlzeit) {
        this.mahlzeit = mahlzeit;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreateMahlzeitRequestType)) return false;
        CreateMahlzeitRequestType other = (CreateMahlzeitRequestType) obj;
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
                ((this.mahlzeit == null && other.getMahlzeit() == null) ||
                        (this.mahlzeit != null &&
                                this.mahlzeit.equals(other.getMahlzeit())));
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
        if (getMahlzeit() != null) {
            _hashCode += getMahlzeit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
