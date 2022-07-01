/**
 * ReadKostenSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Suchkriterien für die Abfrage des Kostenexports.
 */
public class ReadKostenSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadKostenSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadKostenSearchCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("von");
        elemField.setXmlName(new javax.xml.namespace.QName("", "von"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abteilung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "abteilung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inklusiveUnterabteilung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inklusiveUnterabteilung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inklBereitsExportierter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inklBereitsExportierter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alsExportiertMarkieren");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alsExportiertMarkieren"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

    /* Der Anfang des Zeitraums, in dem die zu lesenden Buchungsdaten
     * liegen. */
    private String von;
    /* Das Ende des Zeitraums, in dem die zu lesenden Buchungsdaten
     * liegen. */
    private String bis;
    /* Die Abteilung, zu der die gelesenen Buchungsdaten gehören. */
    private String abteilung;
    /* Flagge, ob auch die Buchungsdaten von Unter-Abteilungen geliefert
     * werden sollen. */
    private Boolean inklusiveUnterabteilung;
    /* Die Id des Benutzers, zu dem die Buchungsdaten geliefert werden
     * sollen. */
    private String userId;
    private Boolean inklBereitsExportierter;
    private Boolean alsExportiertMarkieren;
    /* Attribute für kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadKostenSearchCriteriaType() {
    }


    public ReadKostenSearchCriteriaType(
            String von,
            String bis,
            String abteilung,
            Boolean inklusiveUnterabteilung,
            String userId,
            Boolean inklBereitsExportierter,
            Boolean alsExportiertMarkieren,
            AttributeType[] attributes) {
        this.von = von;
        this.bis = bis;
        this.abteilung = abteilung;
        this.inklusiveUnterabteilung = inklusiveUnterabteilung;
        this.userId = userId;
        this.inklBereitsExportierter = inklBereitsExportierter;
        this.alsExportiertMarkieren = alsExportiertMarkieren;
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
     * Gets the von value for this ReadKostenSearchCriteriaType.
     *
     * @return von   * Der Anfang des Zeitraums, in dem die zu lesenden Buchungsdaten
     * liegen.
     */
    public String getVon() {
        return von;
    }

    /**
     * Sets the von value for this ReadKostenSearchCriteriaType.
     *
     * @param von   * Der Anfang des Zeitraums, in dem die zu lesenden Buchungsdaten
     * liegen.
     */
    public void setVon(String von) {
        this.von = von;
    }

    /**
     * Gets the bis value for this ReadKostenSearchCriteriaType.
     *
     * @return bis   * Das Ende des Zeitraums, in dem die zu lesenden Buchungsdaten
     * liegen.
     */
    public String getBis() {
        return bis;
    }

    /**
     * Sets the bis value for this ReadKostenSearchCriteriaType.
     *
     * @param bis   * Das Ende des Zeitraums, in dem die zu lesenden Buchungsdaten
     * liegen.
     */
    public void setBis(String bis) {
        this.bis = bis;
    }

    /**
     * Gets the abteilung value for this ReadKostenSearchCriteriaType.
     *
     * @return abteilung   * Die Abteilung, zu der die gelesenen Buchungsdaten gehören.
     */
    public String getAbteilung() {
        return abteilung;
    }

    /**
     * Sets the abteilung value for this ReadKostenSearchCriteriaType.
     *
     * @param abteilung   * Die Abteilung, zu der die gelesenen Buchungsdaten gehören.
     */
    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    /**
     * Gets the inklusiveUnterabteilung value for this ReadKostenSearchCriteriaType.
     *
     * @return inklusiveUnterabteilung   * Flagge, ob auch die Buchungsdaten von Unter-Abteilungen geliefert
     * werden sollen.
     */
    public Boolean getInklusiveUnterabteilung() {
        return inklusiveUnterabteilung;
    }

    /**
     * Sets the inklusiveUnterabteilung value for this ReadKostenSearchCriteriaType.
     *
     * @param inklusiveUnterabteilung   * Flagge, ob auch die Buchungsdaten von Unter-Abteilungen geliefert
     * werden sollen.
     */
    public void setInklusiveUnterabteilung(Boolean inklusiveUnterabteilung) {
        this.inklusiveUnterabteilung = inklusiveUnterabteilung;
    }

    /**
     * Gets the userId value for this ReadKostenSearchCriteriaType.
     *
     * @return userId   * Die Id des Benutzers, zu dem die Buchungsdaten geliefert werden
     * sollen.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId value for this ReadKostenSearchCriteriaType.
     *
     * @param userId   * Die Id des Benutzers, zu dem die Buchungsdaten geliefert werden
     * sollen.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the inklBereitsExportierter value for this ReadKostenSearchCriteriaType.
     *
     * @return inklBereitsExportierter
     */
    public Boolean getInklBereitsExportierter() {
        return inklBereitsExportierter;
    }

    /**
     * Sets the inklBereitsExportierter value for this ReadKostenSearchCriteriaType.
     *
     * @param inklBereitsExportierter
     */
    public void setInklBereitsExportierter(Boolean inklBereitsExportierter) {
        this.inklBereitsExportierter = inklBereitsExportierter;
    }

    /**
     * Gets the alsExportiertMarkieren value for this ReadKostenSearchCriteriaType.
     *
     * @return alsExportiertMarkieren
     */
    public Boolean getAlsExportiertMarkieren() {
        return alsExportiertMarkieren;
    }

    /**
     * Sets the alsExportiertMarkieren value for this ReadKostenSearchCriteriaType.
     *
     * @param alsExportiertMarkieren
     */
    public void setAlsExportiertMarkieren(Boolean alsExportiertMarkieren) {
        this.alsExportiertMarkieren = alsExportiertMarkieren;
    }

    /**
     * Gets the attributes value for this ReadKostenSearchCriteriaType.
     *
     * @return attributes   * Attribute für kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this ReadKostenSearchCriteriaType.
     *
     * @param attributes   * Attribute für kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadKostenSearchCriteriaType)) return false;
        ReadKostenSearchCriteriaType other = (ReadKostenSearchCriteriaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.von == null && other.getVon() == null) ||
                        (this.von != null &&
                                this.von.equals(other.getVon()))) &&
                ((this.bis == null && other.getBis() == null) ||
                        (this.bis != null &&
                                this.bis.equals(other.getBis()))) &&
                ((this.abteilung == null && other.getAbteilung() == null) ||
                        (this.abteilung != null &&
                                this.abteilung.equals(other.getAbteilung()))) &&
                ((this.inklusiveUnterabteilung == null && other.getInklusiveUnterabteilung() == null) ||
                        (this.inklusiveUnterabteilung != null &&
                                this.inklusiveUnterabteilung.equals(other.getInklusiveUnterabteilung()))) &&
                ((this.userId == null && other.getUserId() == null) ||
                        (this.userId != null &&
                                this.userId.equals(other.getUserId()))) &&
                ((this.inklBereitsExportierter == null && other.getInklBereitsExportierter() == null) ||
                        (this.inklBereitsExportierter != null &&
                                this.inklBereitsExportierter.equals(other.getInklBereitsExportierter()))) &&
                ((this.alsExportiertMarkieren == null && other.getAlsExportiertMarkieren() == null) ||
                        (this.alsExportiertMarkieren != null &&
                                this.alsExportiertMarkieren.equals(other.getAlsExportiertMarkieren()))) &&
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
        if (getVon() != null) {
            _hashCode += getVon().hashCode();
        }
        if (getBis() != null) {
            _hashCode += getBis().hashCode();
        }
        if (getAbteilung() != null) {
            _hashCode += getAbteilung().hashCode();
        }
        if (getInklusiveUnterabteilung() != null) {
            _hashCode += getInklusiveUnterabteilung().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getInklBereitsExportierter() != null) {
            _hashCode += getInklBereitsExportierter().hashCode();
        }
        if (getAlsExportiertMarkieren() != null) {
            _hashCode += getAlsExportiertMarkieren().hashCode();
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
