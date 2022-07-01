/**
 * UpdateProjektRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Parameter zur Aktualisierung eines Projekts.
 */
public class UpdateProjektRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(UpdateProjektRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "UpdateProjektRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projekt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projekt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ProjektType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* Die Daten zur Aktualisierung des Projekts. */
    private ProjektType projekt;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public UpdateProjektRequestType() {
    }


    public UpdateProjektRequestType(
            RequestHeaderType requestHeader,
            ProjektType projekt) {
        this.requestHeader = requestHeader;
        this.projekt = projekt;
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
     * Gets the requestHeader value for this UpdateProjektRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this UpdateProjektRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the projekt value for this UpdateProjektRequestType.
     *
     * @return projekt   * Die Daten zur Aktualisierung des Projekts.
     */
    public ProjektType getProjekt() {
        return projekt;
    }

    /**
     * Sets the projekt value for this UpdateProjektRequestType.
     *
     * @param projekt   * Die Daten zur Aktualisierung des Projekts.
     */
    public void setProjekt(ProjektType projekt) {
        this.projekt = projekt;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateProjektRequestType)) return false;
        UpdateProjektRequestType other = (UpdateProjektRequestType) obj;
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
                ((this.projekt == null && other.getProjekt() == null) ||
                        (this.projekt != null &&
                                this.projekt.equals(other.getProjekt())));
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
        if (getProjekt() != null) {
            _hashCode += getProjekt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
