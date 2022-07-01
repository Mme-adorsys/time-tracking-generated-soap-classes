/**
 * RechnungSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class RechnungSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(RechnungSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RechnungSearchCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechnungNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechnungNr"));
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
        elemField.setFieldName("kundenabteilung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kundenabteilung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projektsabteilung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektsabteilung"));
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
        elemField.setFieldName("bereitsAlsEMailVersendet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bereitsAlsEMailVersendet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titel"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projektNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedSince");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifiedSince"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Die Rechnungsnummer. */
    private String rechnungNr;
    private String kundenNr;
    /* Die Abteilung des Kunden. */
    private String kundenabteilung;
    /* Die Abteilung des Projekts. */
    private String projektsabteilung;
    /* Flagge, ob auch in Unterabteilungen
     *             					gesucht werden soll. */
    private Boolean inklusiveUnterabteilung;
    /* Startdatum des Zeitraums für Suche der
     *             					Rechnungen. */
    private String von;
    /* Endedatum des Zeitraums für Suche der
     *             					Rechnungen. */
    private String bis;
    /* true oder 1= nur als Mail versendet0
     *             					false oder 0 = nur nicht als Mail
     *             					versendet leer oder nicht defniert =
     *             					alle */
    private Boolean bereitsAlsEMailVersendet;
    /* ist auch die Gutschriftsnummer bzw.
     *             					exterener Referenz bei
     *             					Eingangsgutschriften. */
    private String titel;
    private Integer projektId;
    private String projektNr;
    private String modifiedSince;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public RechnungSearchCriteriaType() {
    }


    public RechnungSearchCriteriaType(
            String rechnungNr,
            String kundenNr,
            String kundenabteilung,
            String projektsabteilung,
            Boolean inklusiveUnterabteilung,
            String von,
            String bis,
            Boolean bereitsAlsEMailVersendet,
            String titel,
            Integer projektId,
            String projektNr,
            String modifiedSince) {
        this.rechnungNr = rechnungNr;
        this.kundenNr = kundenNr;
        this.kundenabteilung = kundenabteilung;
        this.projektsabteilung = projektsabteilung;
        this.inklusiveUnterabteilung = inklusiveUnterabteilung;
        this.von = von;
        this.bis = bis;
        this.bereitsAlsEMailVersendet = bereitsAlsEMailVersendet;
        this.titel = titel;
        this.projektId = projektId;
        this.projektNr = projektNr;
        this.modifiedSince = modifiedSince;
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
     * Gets the rechnungNr value for this RechnungSearchCriteriaType.
     *
     * @return rechnungNr   * Die Rechnungsnummer.
     */
    public String getRechnungNr() {
        return rechnungNr;
    }

    /**
     * Sets the rechnungNr value for this RechnungSearchCriteriaType.
     *
     * @param rechnungNr   * Die Rechnungsnummer.
     */
    public void setRechnungNr(String rechnungNr) {
        this.rechnungNr = rechnungNr;
    }

    /**
     * Gets the kundenNr value for this RechnungSearchCriteriaType.
     *
     * @return kundenNr
     */
    public String getKundenNr() {
        return kundenNr;
    }

    /**
     * Sets the kundenNr value for this RechnungSearchCriteriaType.
     *
     * @param kundenNr
     */
    public void setKundenNr(String kundenNr) {
        this.kundenNr = kundenNr;
    }

    /**
     * Gets the kundenabteilung value for this RechnungSearchCriteriaType.
     *
     * @return kundenabteilung   * Die Abteilung des Kunden.
     */
    public String getKundenabteilung() {
        return kundenabteilung;
    }

    /**
     * Sets the kundenabteilung value for this RechnungSearchCriteriaType.
     *
     * @param kundenabteilung   * Die Abteilung des Kunden.
     */
    public void setKundenabteilung(String kundenabteilung) {
        this.kundenabteilung = kundenabteilung;
    }

    /**
     * Gets the projektsabteilung value for this RechnungSearchCriteriaType.
     *
     * @return projektsabteilung   * Die Abteilung des Projekts.
     */
    public String getProjektsabteilung() {
        return projektsabteilung;
    }

    /**
     * Sets the projektsabteilung value for this RechnungSearchCriteriaType.
     *
     * @param projektsabteilung   * Die Abteilung des Projekts.
     */
    public void setProjektsabteilung(String projektsabteilung) {
        this.projektsabteilung = projektsabteilung;
    }

    /**
     * Gets the inklusiveUnterabteilung value for this RechnungSearchCriteriaType.
     *
     * @return inklusiveUnterabteilung   * Flagge, ob auch in Unterabteilungen
     *             					gesucht werden soll.
     */
    public Boolean getInklusiveUnterabteilung() {
        return inklusiveUnterabteilung;
    }

    /**
     * Sets the inklusiveUnterabteilung value for this RechnungSearchCriteriaType.
     *
     * @param inklusiveUnterabteilung   * Flagge, ob auch in Unterabteilungen
     *             					gesucht werden soll.
     */
    public void setInklusiveUnterabteilung(Boolean inklusiveUnterabteilung) {
        this.inklusiveUnterabteilung = inklusiveUnterabteilung;
    }

    /**
     * Gets the von value for this RechnungSearchCriteriaType.
     *
     * @return von   * Startdatum des Zeitraums für Suche der
     *             					Rechnungen.
     */
    public String getVon() {
        return von;
    }

    /**
     * Sets the von value for this RechnungSearchCriteriaType.
     *
     * @param von   * Startdatum des Zeitraums für Suche der
     *             					Rechnungen.
     */
    public void setVon(String von) {
        this.von = von;
    }

    /**
     * Gets the bis value for this RechnungSearchCriteriaType.
     *
     * @return bis   * Endedatum des Zeitraums für Suche der
     *             					Rechnungen.
     */
    public String getBis() {
        return bis;
    }

    /**
     * Sets the bis value for this RechnungSearchCriteriaType.
     *
     * @param bis   * Endedatum des Zeitraums für Suche der
     *             					Rechnungen.
     */
    public void setBis(String bis) {
        this.bis = bis;
    }

    /**
     * Gets the bereitsAlsEMailVersendet value for this RechnungSearchCriteriaType.
     *
     * @return bereitsAlsEMailVersendet   * true oder 1= nur als Mail versendet0
     *             					false oder 0 = nur nicht als Mail
     *             					versendet leer oder nicht defniert =
     *             					alle
     */
    public Boolean getBereitsAlsEMailVersendet() {
        return bereitsAlsEMailVersendet;
    }

    /**
     * Sets the bereitsAlsEMailVersendet value for this RechnungSearchCriteriaType.
     *
     * @param bereitsAlsEMailVersendet   * true oder 1= nur als Mail versendet0
     *             					false oder 0 = nur nicht als Mail
     *             					versendet leer oder nicht defniert =
     *             					alle
     */
    public void setBereitsAlsEMailVersendet(Boolean bereitsAlsEMailVersendet) {
        this.bereitsAlsEMailVersendet = bereitsAlsEMailVersendet;
    }

    /**
     * Gets the titel value for this RechnungSearchCriteriaType.
     *
     * @return titel   * ist auch die Gutschriftsnummer bzw.
     *             					exterener Referenz bei
     *             					Eingangsgutschriften.
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Sets the titel value for this RechnungSearchCriteriaType.
     *
     * @param titel   * ist auch die Gutschriftsnummer bzw.
     *             					exterener Referenz bei
     *             					Eingangsgutschriften.
     */
    public void setTitel(String titel) {
        this.titel = titel;
    }

    /**
     * Gets the projektId value for this RechnungSearchCriteriaType.
     *
     * @return projektId
     */
    public Integer getProjektId() {
        return projektId;
    }

    /**
     * Sets the projektId value for this RechnungSearchCriteriaType.
     *
     * @param projektId
     */
    public void setProjektId(Integer projektId) {
        this.projektId = projektId;
    }

    /**
     * Gets the projektNr value for this RechnungSearchCriteriaType.
     *
     * @return projektNr
     */
    public String getProjektNr() {
        return projektNr;
    }

    /**
     * Sets the projektNr value for this RechnungSearchCriteriaType.
     *
     * @param projektNr
     */
    public void setProjektNr(String projektNr) {
        this.projektNr = projektNr;
    }

    /**
     * Gets the modifiedSince value for this RechnungSearchCriteriaType.
     *
     * @return modifiedSince
     */
    public String getModifiedSince() {
        return modifiedSince;
    }

    /**
     * Sets the modifiedSince value for this RechnungSearchCriteriaType.
     *
     * @param modifiedSince
     */
    public void setModifiedSince(String modifiedSince) {
        this.modifiedSince = modifiedSince;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RechnungSearchCriteriaType)) return false;
        RechnungSearchCriteriaType other = (RechnungSearchCriteriaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.rechnungNr == null && other.getRechnungNr() == null) ||
                        (this.rechnungNr != null &&
                                this.rechnungNr.equals(other.getRechnungNr()))) &&
                ((this.kundenNr == null && other.getKundenNr() == null) ||
                        (this.kundenNr != null &&
                                this.kundenNr.equals(other.getKundenNr()))) &&
                ((this.kundenabteilung == null && other.getKundenabteilung() == null) ||
                        (this.kundenabteilung != null &&
                                this.kundenabteilung.equals(other.getKundenabteilung()))) &&
                ((this.projektsabteilung == null && other.getProjektsabteilung() == null) ||
                        (this.projektsabteilung != null &&
                                this.projektsabteilung.equals(other.getProjektsabteilung()))) &&
                ((this.inklusiveUnterabteilung == null && other.getInklusiveUnterabteilung() == null) ||
                        (this.inklusiveUnterabteilung != null &&
                                this.inklusiveUnterabteilung.equals(other.getInklusiveUnterabteilung()))) &&
                ((this.von == null && other.getVon() == null) ||
                        (this.von != null &&
                                this.von.equals(other.getVon()))) &&
                ((this.bis == null && other.getBis() == null) ||
                        (this.bis != null &&
                                this.bis.equals(other.getBis()))) &&
                ((this.bereitsAlsEMailVersendet == null && other.getBereitsAlsEMailVersendet() == null) ||
                        (this.bereitsAlsEMailVersendet != null &&
                                this.bereitsAlsEMailVersendet.equals(other.getBereitsAlsEMailVersendet()))) &&
                ((this.titel == null && other.getTitel() == null) ||
                        (this.titel != null &&
                                this.titel.equals(other.getTitel()))) &&
                ((this.projektId == null && other.getProjektId() == null) ||
                        (this.projektId != null &&
                                this.projektId.equals(other.getProjektId()))) &&
                ((this.projektNr == null && other.getProjektNr() == null) ||
                        (this.projektNr != null &&
                                this.projektNr.equals(other.getProjektNr()))) &&
                ((this.modifiedSince == null && other.getModifiedSince() == null) ||
                        (this.modifiedSince != null &&
                                this.modifiedSince.equals(other.getModifiedSince())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRechnungNr() != null) {
            _hashCode += getRechnungNr().hashCode();
        }
        if (getKundenNr() != null) {
            _hashCode += getKundenNr().hashCode();
        }
        if (getKundenabteilung() != null) {
            _hashCode += getKundenabteilung().hashCode();
        }
        if (getProjektsabteilung() != null) {
            _hashCode += getProjektsabteilung().hashCode();
        }
        if (getInklusiveUnterabteilung() != null) {
            _hashCode += getInklusiveUnterabteilung().hashCode();
        }
        if (getVon() != null) {
            _hashCode += getVon().hashCode();
        }
        if (getBis() != null) {
            _hashCode += getBis().hashCode();
        }
        if (getBereitsAlsEMailVersendet() != null) {
            _hashCode += getBereitsAlsEMailVersendet().hashCode();
        }
        if (getTitel() != null) {
            _hashCode += getTitel().hashCode();
        }
        if (getProjektId() != null) {
            _hashCode += getProjektId().hashCode();
        }
        if (getProjektNr() != null) {
            _hashCode += getProjektNr().hashCode();
        }
        if (getModifiedSince() != null) {
            _hashCode += getModifiedSince().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
