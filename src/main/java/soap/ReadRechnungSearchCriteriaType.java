/**
 * ReadRechnungSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Suchkriterien für die Abfrage des Rechnungsexports.
 */
public class ReadRechnungSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadRechnungSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadRechnungSearchCriteriaType"));
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
    }

    /* Der Anfang des Zeitraums, in dem das Rechnungsdamtum liegen
     * soll. Format: JJJJ-MM-TT. */
    private String von;
    /* Der Ende des Zeitraums, in dem das Rechnungsdamtum liegen soll.
     * Format: JJJJ-MM-TT. */
    private String bis;
    /* Die Bezeichnung der Abteilung des Kunden, zu der Rechnungsdaten
     * geliefert werden sollen. */
    private String abteilung;
    /* Flagge, ob auch Unterabteilungen beachtet werden sollen. */
    private Boolean inklusiveUnterabteilung;
    /* Flagge, ob auch Daten die bereits exportiert wurden, erneut
     * geliefert werden sollen. */
    private Boolean inklBereitsExportierter;
    private Boolean alsExportiertMarkieren;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadRechnungSearchCriteriaType() {
    }


    public ReadRechnungSearchCriteriaType(
            String von,
            String bis,
            String abteilung,
            Boolean inklusiveUnterabteilung,
            Boolean inklBereitsExportierter,
            Boolean alsExportiertMarkieren) {
        this.von = von;
        this.bis = bis;
        this.abteilung = abteilung;
        this.inklusiveUnterabteilung = inklusiveUnterabteilung;
        this.inklBereitsExportierter = inklBereitsExportierter;
        this.alsExportiertMarkieren = alsExportiertMarkieren;
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
     * Gets the von value for this ReadRechnungSearchCriteriaType.
     *
     * @return von   * Der Anfang des Zeitraums, in dem das Rechnungsdamtum liegen
     * soll. Format: JJJJ-MM-TT.
     */
    public String getVon() {
        return von;
    }

    /**
     * Sets the von value for this ReadRechnungSearchCriteriaType.
     *
     * @param von   * Der Anfang des Zeitraums, in dem das Rechnungsdamtum liegen
     * soll. Format: JJJJ-MM-TT.
     */
    public void setVon(String von) {
        this.von = von;
    }

    /**
     * Gets the bis value for this ReadRechnungSearchCriteriaType.
     *
     * @return bis   * Der Ende des Zeitraums, in dem das Rechnungsdamtum liegen soll.
     * Format: JJJJ-MM-TT.
     */
    public String getBis() {
        return bis;
    }

    /**
     * Sets the bis value for this ReadRechnungSearchCriteriaType.
     *
     * @param bis   * Der Ende des Zeitraums, in dem das Rechnungsdamtum liegen soll.
     * Format: JJJJ-MM-TT.
     */
    public void setBis(String bis) {
        this.bis = bis;
    }

    /**
     * Gets the abteilung value for this ReadRechnungSearchCriteriaType.
     *
     * @return abteilung   * Die Bezeichnung der Abteilung des Kunden, zu der Rechnungsdaten
     * geliefert werden sollen.
     */
    public String getAbteilung() {
        return abteilung;
    }

    /**
     * Sets the abteilung value for this ReadRechnungSearchCriteriaType.
     *
     * @param abteilung   * Die Bezeichnung der Abteilung des Kunden, zu der Rechnungsdaten
     * geliefert werden sollen.
     */
    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    /**
     * Gets the inklusiveUnterabteilung value for this ReadRechnungSearchCriteriaType.
     *
     * @return inklusiveUnterabteilung   * Flagge, ob auch Unterabteilungen beachtet werden sollen.
     */
    public Boolean getInklusiveUnterabteilung() {
        return inklusiveUnterabteilung;
    }

    /**
     * Sets the inklusiveUnterabteilung value for this ReadRechnungSearchCriteriaType.
     *
     * @param inklusiveUnterabteilung   * Flagge, ob auch Unterabteilungen beachtet werden sollen.
     */
    public void setInklusiveUnterabteilung(Boolean inklusiveUnterabteilung) {
        this.inklusiveUnterabteilung = inklusiveUnterabteilung;
    }

    /**
     * Gets the inklBereitsExportierter value for this ReadRechnungSearchCriteriaType.
     *
     * @return inklBereitsExportierter   * Flagge, ob auch Daten die bereits exportiert wurden, erneut
     * geliefert werden sollen.
     */
    public Boolean getInklBereitsExportierter() {
        return inklBereitsExportierter;
    }

    /**
     * Sets the inklBereitsExportierter value for this ReadRechnungSearchCriteriaType.
     *
     * @param inklBereitsExportierter   * Flagge, ob auch Daten die bereits exportiert wurden, erneut
     * geliefert werden sollen.
     */
    public void setInklBereitsExportierter(Boolean inklBereitsExportierter) {
        this.inklBereitsExportierter = inklBereitsExportierter;
    }

    /**
     * Gets the alsExportiertMarkieren value for this ReadRechnungSearchCriteriaType.
     *
     * @return alsExportiertMarkieren
     */
    public Boolean getAlsExportiertMarkieren() {
        return alsExportiertMarkieren;
    }

    /**
     * Sets the alsExportiertMarkieren value for this ReadRechnungSearchCriteriaType.
     *
     * @param alsExportiertMarkieren
     */
    public void setAlsExportiertMarkieren(Boolean alsExportiertMarkieren) {
        this.alsExportiertMarkieren = alsExportiertMarkieren;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadRechnungSearchCriteriaType)) return false;
        ReadRechnungSearchCriteriaType other = (ReadRechnungSearchCriteriaType) obj;
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
                ((this.inklBereitsExportierter == null && other.getInklBereitsExportierter() == null) ||
                        (this.inklBereitsExportierter != null &&
                                this.inklBereitsExportierter.equals(other.getInklBereitsExportierter()))) &&
                ((this.alsExportiertMarkieren == null && other.getAlsExportiertMarkieren() == null) ||
                        (this.alsExportiertMarkieren != null &&
                                this.alsExportiertMarkieren.equals(other.getAlsExportiertMarkieren())));
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
        if (getInklBereitsExportierter() != null) {
            _hashCode += getInklBereitsExportierter().hashCode();
        }
        if (getAlsExportiertMarkieren() != null) {
            _hashCode += getAlsExportiertMarkieren().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
