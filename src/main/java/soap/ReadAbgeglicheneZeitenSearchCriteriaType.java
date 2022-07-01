/**
 * ReadAbgeglicheneZeitenSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Suchkriterien zum Lesen von abgeglichenen Zeiten.
 */
public class ReadAbgeglicheneZeitenSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadAbgeglicheneZeitenSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadAbgeglicheneZeitenSearchCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jahr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jahr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der Benutzername. */
    private String userId;
    /* Das Jahr, zu dem die abgeglichenen Zeiten geliefert werden
     * sollen. */
    private Integer jahr;
    /* Der Monat, zu dem die abgeglichenen Zeiten geliefert werden
     * sollen. */
    private Integer monat;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadAbgeglicheneZeitenSearchCriteriaType() {
    }


    public ReadAbgeglicheneZeitenSearchCriteriaType(
            String userId,
            Integer jahr,
            Integer monat) {
        this.userId = userId;
        this.jahr = jahr;
        this.monat = monat;
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
     * Gets the userId value for this ReadAbgeglicheneZeitenSearchCriteriaType.
     *
     * @return userId   * Der Benutzername.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId value for this ReadAbgeglicheneZeitenSearchCriteriaType.
     *
     * @param userId   * Der Benutzername.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the jahr value for this ReadAbgeglicheneZeitenSearchCriteriaType.
     *
     * @return jahr   * Das Jahr, zu dem die abgeglichenen Zeiten geliefert werden
     * sollen.
     */
    public Integer getJahr() {
        return jahr;
    }

    /**
     * Sets the jahr value for this ReadAbgeglicheneZeitenSearchCriteriaType.
     *
     * @param jahr   * Das Jahr, zu dem die abgeglichenen Zeiten geliefert werden
     * sollen.
     */
    public void setJahr(Integer jahr) {
        this.jahr = jahr;
    }

    /**
     * Gets the monat value for this ReadAbgeglicheneZeitenSearchCriteriaType.
     *
     * @return monat   * Der Monat, zu dem die abgeglichenen Zeiten geliefert werden
     * sollen.
     */
    public Integer getMonat() {
        return monat;
    }

    /**
     * Sets the monat value for this ReadAbgeglicheneZeitenSearchCriteriaType.
     *
     * @param monat   * Der Monat, zu dem die abgeglichenen Zeiten geliefert werden
     * sollen.
     */
    public void setMonat(Integer monat) {
        this.monat = monat;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadAbgeglicheneZeitenSearchCriteriaType)) return false;
        ReadAbgeglicheneZeitenSearchCriteriaType other = (ReadAbgeglicheneZeitenSearchCriteriaType) obj;
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
                                this.userId.equals(other.getUserId()))) &&
                ((this.jahr == null && other.getJahr() == null) ||
                        (this.jahr != null &&
                                this.jahr.equals(other.getJahr()))) &&
                ((this.monat == null && other.getMonat() == null) ||
                        (this.monat != null &&
                                this.monat.equals(other.getMonat())));
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
            _hashCode += getUserId().hashCode();
        }
        if (getJahr() != null) {
            _hashCode += getJahr().hashCode();
        }
        if (getMonat() != null) {
            _hashCode += getMonat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
