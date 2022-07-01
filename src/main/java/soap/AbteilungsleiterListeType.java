/**
 * AbteilungsleiterListeType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Liste von Abteilungsleitern.
 */
public class AbteilungsleiterListeType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AbteilungsleiterListeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AbteilungsleiterListeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "String32"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abteilungsleiter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "abteilungsleiter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AbteilungsleiterType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /* Wegen neue Feature create/update Abteilung wird empfolen das
     * AbteilungsleiterType zu benutzen, der unterstützt auch das Löschen
     * eines Abteilungsleiter. */
    private String[] userId;
    /* Wegen neue Feature create/update Abteilung wird empfolen das
     * AbteilungsleiterType zu benutzen, der unterstützt auch das Löschen
     * eines Abteilungsleiter. */
    private AbteilungsleiterType[] abteilungsleiter;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public AbteilungsleiterListeType() {
    }

    public AbteilungsleiterListeType(
            String[] userId,
            AbteilungsleiterType[] abteilungsleiter) {
        this.userId = userId;
        this.abteilungsleiter = abteilungsleiter;
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
     * Gets the userId value for this AbteilungsleiterListeType.
     *
     * @return userId   * Wegen neue Feature create/update Abteilung wird empfolen das
     * AbteilungsleiterType zu benutzen, der unterstützt auch das Löschen
     * eines Abteilungsleiter.
     */
    public String[] getUserId() {
        return userId;
    }

    /**
     * Sets the userId value for this AbteilungsleiterListeType.
     *
     * @param userId   * Wegen neue Feature create/update Abteilung wird empfolen das
     * AbteilungsleiterType zu benutzen, der unterstützt auch das Löschen
     * eines Abteilungsleiter.
     */
    public void setUserId(String[] userId) {
        this.userId = userId;
    }

    public String getUserId(int i) {
        return this.userId[i];
    }

    public void setUserId(int i, String _value) {
        this.userId[i] = _value;
    }

    /**
     * Gets the abteilungsleiter value for this AbteilungsleiterListeType.
     *
     * @return abteilungsleiter   * Wegen neue Feature create/update Abteilung wird empfolen das
     * AbteilungsleiterType zu benutzen, der unterstützt auch das Löschen
     * eines Abteilungsleiter.
     */
    public AbteilungsleiterType[] getAbteilungsleiter() {
        return abteilungsleiter;
    }

    /**
     * Sets the abteilungsleiter value for this AbteilungsleiterListeType.
     *
     * @param abteilungsleiter   * Wegen neue Feature create/update Abteilung wird empfolen das
     * AbteilungsleiterType zu benutzen, der unterstützt auch das Löschen
     * eines Abteilungsleiter.
     */
    public void setAbteilungsleiter(AbteilungsleiterType[] abteilungsleiter) {
        this.abteilungsleiter = abteilungsleiter;
    }

    public AbteilungsleiterType getAbteilungsleiter(int i) {
        return this.abteilungsleiter[i];
    }

    public void setAbteilungsleiter(int i, AbteilungsleiterType _value) {
        this.abteilungsleiter[i] = _value;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AbteilungsleiterListeType)) return false;
        AbteilungsleiterListeType other = (AbteilungsleiterListeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.userId == null && other.getUserId() == null) ||
                        (this.userId != null &&
                                java.util.Arrays.equals(this.userId, other.getUserId()))) &&
                ((this.abteilungsleiter == null && other.getAbteilungsleiter() == null) ||
                        (this.abteilungsleiter != null &&
                                java.util.Arrays.equals(this.abteilungsleiter, other.getAbteilungsleiter())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getUserId() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getUserId());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getUserId(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAbteilungsleiter() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAbteilungsleiter());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAbteilungsleiter(), i);
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
