/**
 * ReadWechselkursSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Suchkriterien zur Abfrage von Wechselkursen. P.S. Basis-Währung
 * wird immer geliefert (zu erkennen durch das Element basis = true).
 */
public class ReadWechselkursSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadWechselkursSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadWechselkursSearchCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waehrung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "waehrung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bisdatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bisdatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vondatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vondatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AttributeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "attribute"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Die Bezeichnung der zu liefernden Wechselkurses. */
    private String waehrung;
    /* End-Zeitraum der Suche (verglichen mit gültig_bis_datum der
     * Währung) */
    private String bisdatum;
    /* Anfang-Zeitraum der Suche (verglichen mit gültig_bis_datum
     * der Währung) */
    private String vondatum;
    /* Attribute für kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadWechselkursSearchCriteriaType() {
    }


    public ReadWechselkursSearchCriteriaType(
            String waehrung,
            String bisdatum,
            String vondatum,
            AttributeType[] attributes) {
        this.waehrung = waehrung;
        this.bisdatum = bisdatum;
        this.vondatum = vondatum;
        this.attributes = attributes;
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
     * Gets the waehrung value for this ReadWechselkursSearchCriteriaType.
     *
     * @return waehrung   * Die Bezeichnung der zu liefernden Wechselkurses.
     */
    public String getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the waehrung value for this ReadWechselkursSearchCriteriaType.
     *
     * @param waehrung   * Die Bezeichnung der zu liefernden Wechselkurses.
     */
    public void setWaehrung(String waehrung) {
        this.waehrung = waehrung;
    }

    /**
     * Gets the bisdatum value for this ReadWechselkursSearchCriteriaType.
     *
     * @return bisdatum   * End-Zeitraum der Suche (verglichen mit gültig_bis_datum der
     * Währung)
     */
    public String getBisdatum() {
        return bisdatum;
    }

    /**
     * Sets the bisdatum value for this ReadWechselkursSearchCriteriaType.
     *
     * @param bisdatum   * End-Zeitraum der Suche (verglichen mit gültig_bis_datum der
     * Währung)
     */
    public void setBisdatum(String bisdatum) {
        this.bisdatum = bisdatum;
    }

    /**
     * Gets the vondatum value for this ReadWechselkursSearchCriteriaType.
     *
     * @return vondatum   * Anfang-Zeitraum der Suche (verglichen mit gültig_bis_datum
     * der Währung)
     */
    public String getVondatum() {
        return vondatum;
    }

    /**
     * Sets the vondatum value for this ReadWechselkursSearchCriteriaType.
     *
     * @param vondatum   * Anfang-Zeitraum der Suche (verglichen mit gültig_bis_datum
     * der Währung)
     */
    public void setVondatum(String vondatum) {
        this.vondatum = vondatum;
    }

    /**
     * Gets the attributes value for this ReadWechselkursSearchCriteriaType.
     *
     * @return attributes   * Attribute für kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this ReadWechselkursSearchCriteriaType.
     *
     * @param attributes   * Attribute für kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadWechselkursSearchCriteriaType)) return false;
        ReadWechselkursSearchCriteriaType other = (ReadWechselkursSearchCriteriaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.waehrung == null && other.getWaehrung() == null) ||
                        (this.waehrung != null &&
                                this.waehrung.equals(other.getWaehrung()))) &&
                ((this.bisdatum == null && other.getBisdatum() == null) ||
                        (this.bisdatum != null &&
                                this.bisdatum.equals(other.getBisdatum()))) &&
                ((this.vondatum == null && other.getVondatum() == null) ||
                        (this.vondatum != null &&
                                this.vondatum.equals(other.getVondatum()))) &&
                ((this.attributes == null && other.getAttributes() == null) ||
                        (this.attributes != null &&
                                java.util.Arrays.equals(this.attributes, other.getAttributes())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getWaehrung() != null) {
            _hashCode += getWaehrung().hashCode();
        }
        if (getBisdatum() != null) {
            _hashCode += getBisdatum().hashCode();
        }
        if (getVondatum() != null) {
            _hashCode += getVondatum().hashCode();
        }
        if (getAttributes() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAttributes(), i);
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
