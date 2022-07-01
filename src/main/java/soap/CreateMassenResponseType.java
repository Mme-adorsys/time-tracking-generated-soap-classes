/**
 * CreateMassenResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Das Resultat der Request-Ausführung.
 */
public class CreateMassenResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CreateMassenResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "CreateMassenResponseType"));
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
        elemField.setFieldName("responseListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "response"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private String version;
    /* gibt den maximalen returnCode der allen Operations (falls dies
     * nicht 0 ist dann sehe einzelne Responses) */
    private String returnCode;
    private ResponseHeaderType[] responseListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public CreateMassenResponseType() {
    }


    public CreateMassenResponseType(
            String version,
            String returnCode,
            ResponseHeaderType[] responseListe) {
        this.version = version;
        this.returnCode = returnCode;
        this.responseListe = responseListe;
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
     * Gets the version value for this CreateMassenResponseType.
     *
     * @return version   * Der allgemeine ZEP Response-Header.
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the version value for this CreateMassenResponseType.
     *
     * @param version   * Der allgemeine ZEP Response-Header.
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Gets the returnCode value for this CreateMassenResponseType.
     *
     * @return returnCode   * gibt den maximalen returnCode der allen Operations (falls dies
     * nicht 0 ist dann sehe einzelne Responses)
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the returnCode value for this CreateMassenResponseType.
     *
     * @param returnCode   * gibt den maximalen returnCode der allen Operations (falls dies
     * nicht 0 ist dann sehe einzelne Responses)
     */
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    /**
     * Gets the responseListe value for this CreateMassenResponseType.
     *
     * @return responseListe
     */
    public ResponseHeaderType[] getResponseListe() {
        return responseListe;
    }

    /**
     * Sets the responseListe value for this CreateMassenResponseType.
     *
     * @param responseListe
     */
    public void setResponseListe(ResponseHeaderType[] responseListe) {
        this.responseListe = responseListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreateMassenResponseType)) return false;
        CreateMassenResponseType other = (CreateMassenResponseType) obj;
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
                ((this.responseListe == null && other.getResponseListe() == null) ||
                        (this.responseListe != null &&
                                java.util.Arrays.equals(this.responseListe, other.getResponseListe())));
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
        if (getResponseListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getResponseListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getResponseListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
