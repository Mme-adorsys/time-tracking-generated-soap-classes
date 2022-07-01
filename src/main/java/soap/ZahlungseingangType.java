/**
 * ZahlungseingangType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class ZahlungseingangType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ZahlungseingangType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ZahlungseingangType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechnungNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechnungNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("kundenNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kundenNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("skontodatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "skontodatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zahlungsziel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zahlungsziel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betragNetto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betragNetto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betragBrutto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betragBrutto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zahlungseingang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zahlungseingang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zahlung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zahlung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minderung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minderung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mwst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mwst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bemerkung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bemerkung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private String rechnungNr;
    private String projektNr;
    private String kundenNr;
    private String rechnungsdatum;
    private String skontodatum;
    private String zahlungsziel;
    private Float betragNetto;
    private Float betragBrutto;
    private String zahlungseingang;
    private Float zahlung;
    private Float minderung;
    private Float mwst;
    private String bemerkung;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ZahlungseingangType() {
    }


    public ZahlungseingangType(
            String rechnungNr,
            String projektNr,
            String kundenNr,
            String rechnungsdatum,
            String skontodatum,
            String zahlungsziel,
            Float betragNetto,
            Float betragBrutto,
            String zahlungseingang,
            Float zahlung,
            Float minderung,
            Float mwst,
            String bemerkung) {
        this.rechnungNr = rechnungNr;
        this.projektNr = projektNr;
        this.kundenNr = kundenNr;
        this.rechnungsdatum = rechnungsdatum;
        this.skontodatum = skontodatum;
        this.zahlungsziel = zahlungsziel;
        this.betragNetto = betragNetto;
        this.betragBrutto = betragBrutto;
        this.zahlungseingang = zahlungseingang;
        this.zahlung = zahlung;
        this.minderung = minderung;
        this.mwst = mwst;
        this.bemerkung = bemerkung;
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
     * Gets the rechnungNr value for this ZahlungseingangType.
     *
     * @return rechnungNr
     */
    public String getRechnungNr() {
        return rechnungNr;
    }

    /**
     * Sets the rechnungNr value for this ZahlungseingangType.
     *
     * @param rechnungNr
     */
    public void setRechnungNr(String rechnungNr) {
        this.rechnungNr = rechnungNr;
    }

    /**
     * Gets the projektNr value for this ZahlungseingangType.
     *
     * @return projektNr
     */
    public String getProjektNr() {
        return projektNr;
    }

    /**
     * Sets the projektNr value for this ZahlungseingangType.
     *
     * @param projektNr
     */
    public void setProjektNr(String projektNr) {
        this.projektNr = projektNr;
    }

    /**
     * Gets the kundenNr value for this ZahlungseingangType.
     *
     * @return kundenNr
     */
    public String getKundenNr() {
        return kundenNr;
    }

    /**
     * Sets the kundenNr value for this ZahlungseingangType.
     *
     * @param kundenNr
     */
    public void setKundenNr(String kundenNr) {
        this.kundenNr = kundenNr;
    }

    /**
     * Gets the rechnungsdatum value for this ZahlungseingangType.
     *
     * @return rechnungsdatum
     */
    public String getRechnungsdatum() {
        return rechnungsdatum;
    }

    /**
     * Sets the rechnungsdatum value for this ZahlungseingangType.
     *
     * @param rechnungsdatum
     */
    public void setRechnungsdatum(String rechnungsdatum) {
        this.rechnungsdatum = rechnungsdatum;
    }

    /**
     * Gets the skontodatum value for this ZahlungseingangType.
     *
     * @return skontodatum
     */
    public String getSkontodatum() {
        return skontodatum;
    }

    /**
     * Sets the skontodatum value for this ZahlungseingangType.
     *
     * @param skontodatum
     */
    public void setSkontodatum(String skontodatum) {
        this.skontodatum = skontodatum;
    }

    /**
     * Gets the zahlungsziel value for this ZahlungseingangType.
     *
     * @return zahlungsziel
     */
    public String getZahlungsziel() {
        return zahlungsziel;
    }

    /**
     * Sets the zahlungsziel value for this ZahlungseingangType.
     *
     * @param zahlungsziel
     */
    public void setZahlungsziel(String zahlungsziel) {
        this.zahlungsziel = zahlungsziel;
    }

    /**
     * Gets the betragNetto value for this ZahlungseingangType.
     *
     * @return betragNetto
     */
    public Float getBetragNetto() {
        return betragNetto;
    }

    /**
     * Sets the betragNetto value for this ZahlungseingangType.
     *
     * @param betragNetto
     */
    public void setBetragNetto(Float betragNetto) {
        this.betragNetto = betragNetto;
    }

    /**
     * Gets the betragBrutto value for this ZahlungseingangType.
     *
     * @return betragBrutto
     */
    public Float getBetragBrutto() {
        return betragBrutto;
    }

    /**
     * Sets the betragBrutto value for this ZahlungseingangType.
     *
     * @param betragBrutto
     */
    public void setBetragBrutto(Float betragBrutto) {
        this.betragBrutto = betragBrutto;
    }

    /**
     * Gets the zahlungseingang value for this ZahlungseingangType.
     *
     * @return zahlungseingang
     */
    public String getZahlungseingang() {
        return zahlungseingang;
    }

    /**
     * Sets the zahlungseingang value for this ZahlungseingangType.
     *
     * @param zahlungseingang
     */
    public void setZahlungseingang(String zahlungseingang) {
        this.zahlungseingang = zahlungseingang;
    }

    /**
     * Gets the zahlung value for this ZahlungseingangType.
     *
     * @return zahlung
     */
    public Float getZahlung() {
        return zahlung;
    }

    /**
     * Sets the zahlung value for this ZahlungseingangType.
     *
     * @param zahlung
     */
    public void setZahlung(Float zahlung) {
        this.zahlung = zahlung;
    }

    /**
     * Gets the minderung value for this ZahlungseingangType.
     *
     * @return minderung
     */
    public Float getMinderung() {
        return minderung;
    }

    /**
     * Sets the minderung value for this ZahlungseingangType.
     *
     * @param minderung
     */
    public void setMinderung(Float minderung) {
        this.minderung = minderung;
    }

    /**
     * Gets the mwst value for this ZahlungseingangType.
     *
     * @return mwst
     */
    public Float getMwst() {
        return mwst;
    }

    /**
     * Sets the mwst value for this ZahlungseingangType.
     *
     * @param mwst
     */
    public void setMwst(Float mwst) {
        this.mwst = mwst;
    }

    /**
     * Gets the bemerkung value for this ZahlungseingangType.
     *
     * @return bemerkung
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Sets the bemerkung value for this ZahlungseingangType.
     *
     * @param bemerkung
     */
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ZahlungseingangType)) return false;
        ZahlungseingangType other = (ZahlungseingangType) obj;
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
                ((this.projektNr == null && other.getProjektNr() == null) ||
                        (this.projektNr != null &&
                                this.projektNr.equals(other.getProjektNr()))) &&
                ((this.kundenNr == null && other.getKundenNr() == null) ||
                        (this.kundenNr != null &&
                                this.kundenNr.equals(other.getKundenNr()))) &&
                ((this.rechnungsdatum == null && other.getRechnungsdatum() == null) ||
                        (this.rechnungsdatum != null &&
                                this.rechnungsdatum.equals(other.getRechnungsdatum()))) &&
                ((this.skontodatum == null && other.getSkontodatum() == null) ||
                        (this.skontodatum != null &&
                                this.skontodatum.equals(other.getSkontodatum()))) &&
                ((this.zahlungsziel == null && other.getZahlungsziel() == null) ||
                        (this.zahlungsziel != null &&
                                this.zahlungsziel.equals(other.getZahlungsziel()))) &&
                ((this.betragNetto == null && other.getBetragNetto() == null) ||
                        (this.betragNetto != null &&
                                this.betragNetto.equals(other.getBetragNetto()))) &&
                ((this.betragBrutto == null && other.getBetragBrutto() == null) ||
                        (this.betragBrutto != null &&
                                this.betragBrutto.equals(other.getBetragBrutto()))) &&
                ((this.zahlungseingang == null && other.getZahlungseingang() == null) ||
                        (this.zahlungseingang != null &&
                                this.zahlungseingang.equals(other.getZahlungseingang()))) &&
                ((this.zahlung == null && other.getZahlung() == null) ||
                        (this.zahlung != null &&
                                this.zahlung.equals(other.getZahlung()))) &&
                ((this.minderung == null && other.getMinderung() == null) ||
                        (this.minderung != null &&
                                this.minderung.equals(other.getMinderung()))) &&
                ((this.mwst == null && other.getMwst() == null) ||
                        (this.mwst != null &&
                                this.mwst.equals(other.getMwst()))) &&
                ((this.bemerkung == null && other.getBemerkung() == null) ||
                        (this.bemerkung != null &&
                                this.bemerkung.equals(other.getBemerkung())));
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
        if (getProjektNr() != null) {
            _hashCode += getProjektNr().hashCode();
        }
        if (getKundenNr() != null) {
            _hashCode += getKundenNr().hashCode();
        }
        if (getRechnungsdatum() != null) {
            _hashCode += getRechnungsdatum().hashCode();
        }
        if (getSkontodatum() != null) {
            _hashCode += getSkontodatum().hashCode();
        }
        if (getZahlungsziel() != null) {
            _hashCode += getZahlungsziel().hashCode();
        }
        if (getBetragNetto() != null) {
            _hashCode += getBetragNetto().hashCode();
        }
        if (getBetragBrutto() != null) {
            _hashCode += getBetragBrutto().hashCode();
        }
        if (getZahlungseingang() != null) {
            _hashCode += getZahlungseingang().hashCode();
        }
        if (getZahlung() != null) {
            _hashCode += getZahlung().hashCode();
        }
        if (getMinderung() != null) {
            _hashCode += getMinderung().hashCode();
        }
        if (getMwst() != null) {
            _hashCode += getMwst().hashCode();
        }
        if (getBemerkung() != null) {
            _hashCode += getBemerkung().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
