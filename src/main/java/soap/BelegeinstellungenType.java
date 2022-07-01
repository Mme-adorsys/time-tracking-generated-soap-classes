/**
 * BelegeinstellungenType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class BelegeinstellungenType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(BelegeinstellungenType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "BelegeinstellungenType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belegerfassung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belegerfassung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belegerfassungOhneVorgang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belegerfassungOhneVorgang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuFakturierendenBetrag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zuFakturierendenBetrag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private Boolean belegerfassung;
    private Boolean belegerfassungOhneVorgang;
    /* 0 = bei der Erfassung selbst eingeben
     * 1 = Vorbelegung identisch weiterfakturieren
     * 2 = Vorbelegung nicht weiterfakturieren */
    private Integer zuFakturierendenBetrag;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public BelegeinstellungenType() {
    }


    public BelegeinstellungenType(
            Boolean belegerfassung,
            Boolean belegerfassungOhneVorgang,
            Integer zuFakturierendenBetrag) {
        this.belegerfassung = belegerfassung;
        this.belegerfassungOhneVorgang = belegerfassungOhneVorgang;
        this.zuFakturierendenBetrag = zuFakturierendenBetrag;
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
     * Gets the belegerfassung value for this BelegeinstellungenType.
     *
     * @return belegerfassung
     */
    public Boolean getBelegerfassung() {
        return belegerfassung;
    }

    /**
     * Sets the belegerfassung value for this BelegeinstellungenType.
     *
     * @param belegerfassung
     */
    public void setBelegerfassung(Boolean belegerfassung) {
        this.belegerfassung = belegerfassung;
    }

    /**
     * Gets the belegerfassungOhneVorgang value for this BelegeinstellungenType.
     *
     * @return belegerfassungOhneVorgang
     */
    public Boolean getBelegerfassungOhneVorgang() {
        return belegerfassungOhneVorgang;
    }

    /**
     * Sets the belegerfassungOhneVorgang value for this BelegeinstellungenType.
     *
     * @param belegerfassungOhneVorgang
     */
    public void setBelegerfassungOhneVorgang(Boolean belegerfassungOhneVorgang) {
        this.belegerfassungOhneVorgang = belegerfassungOhneVorgang;
    }

    /**
     * Gets the zuFakturierendenBetrag value for this BelegeinstellungenType.
     *
     * @return zuFakturierendenBetrag   * 0 = bei der Erfassung selbst eingeben
     * 1 = Vorbelegung identisch weiterfakturieren
     * 2 = Vorbelegung nicht weiterfakturieren
     */
    public Integer getZuFakturierendenBetrag() {
        return zuFakturierendenBetrag;
    }

    /**
     * Sets the zuFakturierendenBetrag value for this BelegeinstellungenType.
     *
     * @param zuFakturierendenBetrag   * 0 = bei der Erfassung selbst eingeben
     * 1 = Vorbelegung identisch weiterfakturieren
     * 2 = Vorbelegung nicht weiterfakturieren
     */
    public void setZuFakturierendenBetrag(Integer zuFakturierendenBetrag) {
        this.zuFakturierendenBetrag = zuFakturierendenBetrag;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BelegeinstellungenType)) return false;
        BelegeinstellungenType other = (BelegeinstellungenType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.belegerfassung == null && other.getBelegerfassung() == null) ||
                        (this.belegerfassung != null &&
                                this.belegerfassung.equals(other.getBelegerfassung()))) &&
                ((this.belegerfassungOhneVorgang == null && other.getBelegerfassungOhneVorgang() == null) ||
                        (this.belegerfassungOhneVorgang != null &&
                                this.belegerfassungOhneVorgang.equals(other.getBelegerfassungOhneVorgang()))) &&
                ((this.zuFakturierendenBetrag == null && other.getZuFakturierendenBetrag() == null) ||
                        (this.zuFakturierendenBetrag != null &&
                                this.zuFakturierendenBetrag.equals(other.getZuFakturierendenBetrag())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBelegerfassung() != null) {
            _hashCode += getBelegerfassung().hashCode();
        }
        if (getBelegerfassungOhneVorgang() != null) {
            _hashCode += getBelegerfassungOhneVorgang().hashCode();
        }
        if (getZuFakturierendenBetrag() != null) {
            _hashCode += getZuFakturierendenBetrag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
