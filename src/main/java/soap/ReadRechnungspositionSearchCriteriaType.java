/**
 * ReadRechnungspositionSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Kriterien zur Suche von Rechnungspositionen.
 */
public class ReadRechnungspositionSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadRechnungspositionSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadRechnungspositionSearchCriteriaType"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechnungsdatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechnungsdatum"));
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

    /* Das Projekt, zu dem Rechnungspositionen
     *                 				abgefragt werden sollen. */
    private String projektNr;
    /* Der Kunde, zu dem Rechnungspositionen
     *                 				abgefragt werden sollen. */
    private String kundenNr;
    /* Das Anfangsdatum des Leistungszeitraums
     *                 				der zu liefernden Rechnungspositionen. */
    private String leistungszeitraumBeginn;
    /* Das Endedatum des Leistungszeitraums der
     *                 				zu liefernden Rechnungspositionen. */
    private String leistungszeitraumEnde;
    /* Der Status der zu liefernden
     *                 				Rechnungspositionen. 0 = geplant, 1 =
     *                 				freigegeben, 2 = abgerechnet, 3 =
     *                 				storniert. leer bzw. nicht definiert =
     *                 				alle */
    private Integer status;
    private String rechnungsdatum;
    private Integer projektId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadRechnungspositionSearchCriteriaType() {
    }


    public ReadRechnungspositionSearchCriteriaType(
            String projektNr,
            String kundenNr,
            String leistungszeitraumBeginn,
            String leistungszeitraumEnde,
            Integer status,
            String rechnungsdatum,
            Integer projektId) {
        this.projektNr = projektNr;
        this.kundenNr = kundenNr;
        this.leistungszeitraumBeginn = leistungszeitraumBeginn;
        this.leistungszeitraumEnde = leistungszeitraumEnde;
        this.status = status;
        this.rechnungsdatum = rechnungsdatum;
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
     * Gets the projektNr value for this ReadRechnungspositionSearchCriteriaType.
     *
     * @return projektNr   * Das Projekt, zu dem Rechnungspositionen
     *                 				abgefragt werden sollen.
     */
    public String getProjektNr() {
        return projektNr;
    }

    /**
     * Sets the projektNr value for this ReadRechnungspositionSearchCriteriaType.
     *
     * @param projektNr   * Das Projekt, zu dem Rechnungspositionen
     *                 				abgefragt werden sollen.
     */
    public void setProjektNr(String projektNr) {
        this.projektNr = projektNr;
    }

    /**
     * Gets the kundenNr value for this ReadRechnungspositionSearchCriteriaType.
     *
     * @return kundenNr   * Der Kunde, zu dem Rechnungspositionen
     *                 				abgefragt werden sollen.
     */
    public String getKundenNr() {
        return kundenNr;
    }

    /**
     * Sets the kundenNr value for this ReadRechnungspositionSearchCriteriaType.
     *
     * @param kundenNr   * Der Kunde, zu dem Rechnungspositionen
     *                 				abgefragt werden sollen.
     */
    public void setKundenNr(String kundenNr) {
        this.kundenNr = kundenNr;
    }

    /**
     * Gets the leistungszeitraumBeginn value for this ReadRechnungspositionSearchCriteriaType.
     *
     * @return leistungszeitraumBeginn   * Das Anfangsdatum des Leistungszeitraums
     *                 				der zu liefernden Rechnungspositionen.
     */
    public String getLeistungszeitraumBeginn() {
        return leistungszeitraumBeginn;
    }

    /**
     * Sets the leistungszeitraumBeginn value for this ReadRechnungspositionSearchCriteriaType.
     *
     * @param leistungszeitraumBeginn   * Das Anfangsdatum des Leistungszeitraums
     *                 				der zu liefernden Rechnungspositionen.
     */
    public void setLeistungszeitraumBeginn(String leistungszeitraumBeginn) {
        this.leistungszeitraumBeginn = leistungszeitraumBeginn;
    }

    /**
     * Gets the leistungszeitraumEnde value for this ReadRechnungspositionSearchCriteriaType.
     *
     * @return leistungszeitraumEnde   * Das Endedatum des Leistungszeitraums der
     *                 				zu liefernden Rechnungspositionen.
     */
    public String getLeistungszeitraumEnde() {
        return leistungszeitraumEnde;
    }

    /**
     * Sets the leistungszeitraumEnde value for this ReadRechnungspositionSearchCriteriaType.
     *
     * @param leistungszeitraumEnde   * Das Endedatum des Leistungszeitraums der
     *                 				zu liefernden Rechnungspositionen.
     */
    public void setLeistungszeitraumEnde(String leistungszeitraumEnde) {
        this.leistungszeitraumEnde = leistungszeitraumEnde;
    }

    /**
     * Gets the status value for this ReadRechnungspositionSearchCriteriaType.
     *
     * @return status   * Der Status der zu liefernden
     *                 				Rechnungspositionen. 0 = geplant, 1 =
     *                 				freigegeben, 2 = abgerechnet, 3 =
     *                 				storniert. leer bzw. nicht definiert =
     *                 				alle
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the status value for this ReadRechnungspositionSearchCriteriaType.
     *
     * @param status   * Der Status der zu liefernden
     *                 				Rechnungspositionen. 0 = geplant, 1 =
     *                 				freigegeben, 2 = abgerechnet, 3 =
     *                 				storniert. leer bzw. nicht definiert =
     *                 				alle
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Gets the rechnungsdatum value for this ReadRechnungspositionSearchCriteriaType.
     *
     * @return rechnungsdatum
     */
    public String getRechnungsdatum() {
        return rechnungsdatum;
    }

    /**
     * Sets the rechnungsdatum value for this ReadRechnungspositionSearchCriteriaType.
     *
     * @param rechnungsdatum
     */
    public void setRechnungsdatum(String rechnungsdatum) {
        this.rechnungsdatum = rechnungsdatum;
    }

    /**
     * Gets the projektId value for this ReadRechnungspositionSearchCriteriaType.
     *
     * @return projektId
     */
    public Integer getProjektId() {
        return projektId;
    }

    /**
     * Sets the projektId value for this ReadRechnungspositionSearchCriteriaType.
     *
     * @param projektId
     */
    public void setProjektId(Integer projektId) {
        this.projektId = projektId;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadRechnungspositionSearchCriteriaType)) return false;
        ReadRechnungspositionSearchCriteriaType other = (ReadRechnungspositionSearchCriteriaType) obj;
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
                ((this.status == null && other.getStatus() == null) ||
                        (this.status != null &&
                                this.status.equals(other.getStatus()))) &&
                ((this.rechnungsdatum == null && other.getRechnungsdatum() == null) ||
                        (this.rechnungsdatum != null &&
                                this.rechnungsdatum.equals(other.getRechnungsdatum()))) &&
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getRechnungsdatum() != null) {
            _hashCode += getRechnungsdatum().hashCode();
        }
        if (getProjektId() != null) {
            _hashCode += getProjektId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
