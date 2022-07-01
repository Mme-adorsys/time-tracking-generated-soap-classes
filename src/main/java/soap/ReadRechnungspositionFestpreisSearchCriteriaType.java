/**
 * ReadRechnungspositionFestpreisSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Kriterien zur Suche von Festpreis-Rechnungspositionen.
 */
public class ReadRechnungspositionFestpreisSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadRechnungspositionFestpreisSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadRechnungspositionFestpreisSearchCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projektNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kundenNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kundenNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leistungszeitraumBeginn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "leistungszeitraumBeginn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leistungszeitraumEnde");
        elemField.setXmlName(new javax.xml.namespace.QName("", "leistungszeitraumEnde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projektId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Das Projekt, zu dem die Festpreis-Rechnungspositionen zu liefern
     * sind. */
    private String projektNr;
    /* Der Kunde, zu dem die Festpreis-Rechnungspositionen zu liefern
     * sind. */
    private String kundenNr;
    /* Das Startdatum des Leistungszeitraums der zu liefernden Festpreis-Rechnungspositionen. */
    private String leistungszeitraumBeginn;
    /* Das Endedatum des Leistungszeitraums der zu liefernden Festpreis-Rechnungspositionen. */
    private String leistungszeitraumEnde;
    private Integer projektId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadRechnungspositionFestpreisSearchCriteriaType() {
    }


    public ReadRechnungspositionFestpreisSearchCriteriaType(
            String projektNr,
            String kundenNr,
            String leistungszeitraumBeginn,
            String leistungszeitraumEnde,
            Integer projektId) {
        this.projektNr = projektNr;
        this.kundenNr = kundenNr;
        this.leistungszeitraumBeginn = leistungszeitraumBeginn;
        this.leistungszeitraumEnde = leistungszeitraumEnde;
        this.projektId = projektId;
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
     * Gets the projektNr value for this ReadRechnungspositionFestpreisSearchCriteriaType.
     *
     * @return projektNr   * Das Projekt, zu dem die Festpreis-Rechnungspositionen zu liefern
     * sind.
     */
    public String getProjektNr() {
        return projektNr;
    }

    /**
     * Sets the projektNr value for this ReadRechnungspositionFestpreisSearchCriteriaType.
     *
     * @param projektNr   * Das Projekt, zu dem die Festpreis-Rechnungspositionen zu liefern
     * sind.
     */
    public void setProjektNr(String projektNr) {
        this.projektNr = projektNr;
    }

    /**
     * Gets the kundenNr value for this ReadRechnungspositionFestpreisSearchCriteriaType.
     *
     * @return kundenNr   * Der Kunde, zu dem die Festpreis-Rechnungspositionen zu liefern
     * sind.
     */
    public String getKundenNr() {
        return kundenNr;
    }

    /**
     * Sets the kundenNr value for this ReadRechnungspositionFestpreisSearchCriteriaType.
     *
     * @param kundenNr   * Der Kunde, zu dem die Festpreis-Rechnungspositionen zu liefern
     * sind.
     */
    public void setKundenNr(String kundenNr) {
        this.kundenNr = kundenNr;
    }

    /**
     * Gets the leistungszeitraumBeginn value for this ReadRechnungspositionFestpreisSearchCriteriaType.
     *
     * @return leistungszeitraumBeginn   * Das Startdatum des Leistungszeitraums der zu liefernden Festpreis-Rechnungspositionen.
     */
    public String getLeistungszeitraumBeginn() {
        return leistungszeitraumBeginn;
    }

    /**
     * Sets the leistungszeitraumBeginn value for this ReadRechnungspositionFestpreisSearchCriteriaType.
     *
     * @param leistungszeitraumBeginn   * Das Startdatum des Leistungszeitraums der zu liefernden Festpreis-Rechnungspositionen.
     */
    public void setLeistungszeitraumBeginn(String leistungszeitraumBeginn) {
        this.leistungszeitraumBeginn = leistungszeitraumBeginn;
    }

    /**
     * Gets the leistungszeitraumEnde value for this ReadRechnungspositionFestpreisSearchCriteriaType.
     *
     * @return leistungszeitraumEnde   * Das Endedatum des Leistungszeitraums der zu liefernden Festpreis-Rechnungspositionen.
     */
    public String getLeistungszeitraumEnde() {
        return leistungszeitraumEnde;
    }

    /**
     * Sets the leistungszeitraumEnde value for this ReadRechnungspositionFestpreisSearchCriteriaType.
     *
     * @param leistungszeitraumEnde   * Das Endedatum des Leistungszeitraums der zu liefernden Festpreis-Rechnungspositionen.
     */
    public void setLeistungszeitraumEnde(String leistungszeitraumEnde) {
        this.leistungszeitraumEnde = leistungszeitraumEnde;
    }

    /**
     * Gets the projektId value for this ReadRechnungspositionFestpreisSearchCriteriaType.
     *
     * @return projektId
     */
    public Integer getProjektId() {
        return projektId;
    }

    /**
     * Sets the projektId value for this ReadRechnungspositionFestpreisSearchCriteriaType.
     *
     * @param projektId
     */
    public void setProjektId(Integer projektId) {
        this.projektId = projektId;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadRechnungspositionFestpreisSearchCriteriaType)) return false;
        ReadRechnungspositionFestpreisSearchCriteriaType other = (ReadRechnungspositionFestpreisSearchCriteriaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.projektNr == null && other.getProjektNr() == null) ||
                        (this.projektNr != null &&
                                this.projektNr.equals(other.getProjektNr()))) &&
                ((this.kundenNr == null && other.getKundenNr() == null) ||
                        (this.kundenNr != null &&
                                this.kundenNr.equals(other.getKundenNr()))) &&
                ((this.leistungszeitraumBeginn == null && other.getLeistungszeitraumBeginn() == null) ||
                        (this.leistungszeitraumBeginn != null &&
                                this.leistungszeitraumBeginn.equals(other.getLeistungszeitraumBeginn()))) &&
                ((this.leistungszeitraumEnde == null && other.getLeistungszeitraumEnde() == null) ||
                        (this.leistungszeitraumEnde != null &&
                                this.leistungszeitraumEnde.equals(other.getLeistungszeitraumEnde()))) &&
                ((this.projektId == null && other.getProjektId() == null) ||
                        (this.projektId != null &&
                                this.projektId.equals(other.getProjektId())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getProjektNr() != null) {
            _hashCode += getProjektNr().hashCode();
        }
        if (getKundenNr() != null) {
            _hashCode += getKundenNr().hashCode();
        }
        if (getLeistungszeitraumBeginn() != null) {
            _hashCode += getLeistungszeitraumBeginn().hashCode();
        }
        if (getLeistungszeitraumEnde() != null) {
            _hashCode += getLeistungszeitraumEnde().hashCode();
        }
        if (getProjektId() != null) {
            _hashCode += getProjektId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
