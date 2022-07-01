/**
 * RechnungType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class RechnungType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(RechnungType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RechnungType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechnungNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechnungNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("art");
        elemField.setXmlName(new javax.xml.namespace.QName("", "art"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betrag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betrag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("waehrung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "waehrung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("korrekturdatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "korrekturdatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zahlungszielDatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zahlungszielDatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adresse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adresse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zahlungsziel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zahlungsziel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emaildatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emaildatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailempfaenger");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailempfaenger"));
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
        elemField.setFieldName("rechnungspositionListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechnungspositionListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RechnungspositionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "rechnungsposition"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mahnungListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mahnungListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "MahnungType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "mahnung"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modified"));
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

    /* Die Rechnungsnummer. */
    private String rechnungNr;
    /* 0 = Rechnung
     * 1 = Eingangsgutschrift */
    private Integer art;
    /* Das Rechnungsdatum. */
    private String datum;
    /* brutto */
    private Double betrag;
    /* 0 = abgerechnet
     * 1 = storniert
     * 2 = in Korrektur */
    private Integer status;
    private String waehrung;
    private String korrekturdatum;
    private String zahlungszielDatum;
    private String adresse;
    /* Kurzform der Abteilung */
    private Integer zahlungsziel;
    private String emaildatum;
    private String emailempfaenger;
    private String kundenNr;
    private RechnungspositionType[] rechnungspositionListe;
    private MahnungType[] mahnungListe;
    /* ist auch die Gutschriftsnummer bzw. exterener Referenz bei
     * Eingangsgutschriften. */
    private String titel;
    private String created;
    private String modified;
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public RechnungType() {
    }


    public RechnungType(
            String rechnungNr,
            Integer art,
            String datum,
            Double betrag,
            Integer status,
            String waehrung,
            String korrekturdatum,
            String zahlungszielDatum,
            String adresse,
            Integer zahlungsziel,
            String emaildatum,
            String emailempfaenger,
            String kundenNr,
            RechnungspositionType[] rechnungspositionListe,
            MahnungType[] mahnungListe,
            String titel,
            String created,
            String modified,
            AttributeType[] attributes) {
        this.rechnungNr = rechnungNr;
        this.art = art;
        this.datum = datum;
        this.betrag = betrag;
        this.status = status;
        this.waehrung = waehrung;
        this.korrekturdatum = korrekturdatum;
        this.zahlungszielDatum = zahlungszielDatum;
        this.adresse = adresse;
        this.zahlungsziel = zahlungsziel;
        this.emaildatum = emaildatum;
        this.emailempfaenger = emailempfaenger;
        this.kundenNr = kundenNr;
        this.rechnungspositionListe = rechnungspositionListe;
        this.mahnungListe = mahnungListe;
        this.titel = titel;
        this.created = created;
        this.modified = modified;
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
     * Gets the rechnungNr value for this RechnungType.
     *
     * @return rechnungNr   * Die Rechnungsnummer.
     */
    public String getRechnungNr() {
        return rechnungNr;
    }

    /**
     * Sets the rechnungNr value for this RechnungType.
     *
     * @param rechnungNr   * Die Rechnungsnummer.
     */
    public void setRechnungNr(String rechnungNr) {
        this.rechnungNr = rechnungNr;
    }

    /**
     * Gets the art value for this RechnungType.
     *
     * @return art   * 0 = Rechnung
     * 1 = Eingangsgutschrift
     */
    public Integer getArt() {
        return art;
    }

    /**
     * Sets the art value for this RechnungType.
     *
     * @param art   * 0 = Rechnung
     * 1 = Eingangsgutschrift
     */
    public void setArt(Integer art) {
        this.art = art;
    }

    /**
     * Gets the datum value for this RechnungType.
     *
     * @return datum   * Das Rechnungsdatum.
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Sets the datum value for this RechnungType.
     *
     * @param datum   * Das Rechnungsdatum.
     */
    public void setDatum(String datum) {
        this.datum = datum;
    }

    /**
     * Gets the betrag value for this RechnungType.
     *
     * @return betrag   * brutto
     */
    public Double getBetrag() {
        return betrag;
    }

    /**
     * Sets the betrag value for this RechnungType.
     *
     * @param betrag   * brutto
     */
    public void setBetrag(Double betrag) {
        this.betrag = betrag;
    }

    /**
     * Gets the status value for this RechnungType.
     *
     * @return status   * 0 = abgerechnet
     * 1 = storniert
     * 2 = in Korrektur
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the status value for this RechnungType.
     *
     * @param status   * 0 = abgerechnet
     * 1 = storniert
     * 2 = in Korrektur
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Gets the waehrung value for this RechnungType.
     *
     * @return waehrung
     */
    public String getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the waehrung value for this RechnungType.
     *
     * @param waehrung
     */
    public void setWaehrung(String waehrung) {
        this.waehrung = waehrung;
    }

    /**
     * Gets the korrekturdatum value for this RechnungType.
     *
     * @return korrekturdatum
     */
    public String getKorrekturdatum() {
        return korrekturdatum;
    }

    /**
     * Sets the korrekturdatum value for this RechnungType.
     *
     * @param korrekturdatum
     */
    public void setKorrekturdatum(String korrekturdatum) {
        this.korrekturdatum = korrekturdatum;
    }

    /**
     * Gets the zahlungszielDatum value for this RechnungType.
     *
     * @return zahlungszielDatum
     */
    public String getZahlungszielDatum() {
        return zahlungszielDatum;
    }

    /**
     * Sets the zahlungszielDatum value for this RechnungType.
     *
     * @param zahlungszielDatum
     */
    public void setZahlungszielDatum(String zahlungszielDatum) {
        this.zahlungszielDatum = zahlungszielDatum;
    }

    /**
     * Gets the adresse value for this RechnungType.
     *
     * @return adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Sets the adresse value for this RechnungType.
     *
     * @param adresse
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * Gets the zahlungsziel value for this RechnungType.
     *
     * @return zahlungsziel   * Kurzform der Abteilung
     */
    public Integer getZahlungsziel() {
        return zahlungsziel;
    }

    /**
     * Sets the zahlungsziel value for this RechnungType.
     *
     * @param zahlungsziel   * Kurzform der Abteilung
     */
    public void setZahlungsziel(Integer zahlungsziel) {
        this.zahlungsziel = zahlungsziel;
    }

    /**
     * Gets the emaildatum value for this RechnungType.
     *
     * @return emaildatum
     */
    public String getEmaildatum() {
        return emaildatum;
    }

    /**
     * Sets the emaildatum value for this RechnungType.
     *
     * @param emaildatum
     */
    public void setEmaildatum(String emaildatum) {
        this.emaildatum = emaildatum;
    }

    /**
     * Gets the emailempfaenger value for this RechnungType.
     *
     * @return emailempfaenger
     */
    public String getEmailempfaenger() {
        return emailempfaenger;
    }

    /**
     * Sets the emailempfaenger value for this RechnungType.
     *
     * @param emailempfaenger
     */
    public void setEmailempfaenger(String emailempfaenger) {
        this.emailempfaenger = emailempfaenger;
    }

    /**
     * Gets the kundenNr value for this RechnungType.
     *
     * @return kundenNr
     */
    public String getKundenNr() {
        return kundenNr;
    }

    /**
     * Sets the kundenNr value for this RechnungType.
     *
     * @param kundenNr
     */
    public void setKundenNr(String kundenNr) {
        this.kundenNr = kundenNr;
    }

    /**
     * Gets the rechnungspositionListe value for this RechnungType.
     *
     * @return rechnungspositionListe
     */
    public RechnungspositionType[] getRechnungspositionListe() {
        return rechnungspositionListe;
    }

    /**
     * Sets the rechnungspositionListe value for this RechnungType.
     *
     * @param rechnungspositionListe
     */
    public void setRechnungspositionListe(RechnungspositionType[] rechnungspositionListe) {
        this.rechnungspositionListe = rechnungspositionListe;
    }

    /**
     * Gets the mahnungListe value for this RechnungType.
     *
     * @return mahnungListe
     */
    public MahnungType[] getMahnungListe() {
        return mahnungListe;
    }

    /**
     * Sets the mahnungListe value for this RechnungType.
     *
     * @param mahnungListe
     */
    public void setMahnungListe(MahnungType[] mahnungListe) {
        this.mahnungListe = mahnungListe;
    }

    /**
     * Gets the titel value for this RechnungType.
     *
     * @return titel   * ist auch die Gutschriftsnummer bzw. exterener Referenz bei
     * Eingangsgutschriften.
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Sets the titel value for this RechnungType.
     *
     * @param titel   * ist auch die Gutschriftsnummer bzw. exterener Referenz bei
     * Eingangsgutschriften.
     */
    public void setTitel(String titel) {
        this.titel = titel;
    }

    /**
     * Gets the created value for this RechnungType.
     *
     * @return created
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the created value for this RechnungType.
     *
     * @param created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * Gets the modified value for this RechnungType.
     *
     * @return modified
     */
    public String getModified() {
        return modified;
    }

    /**
     * Sets the modified value for this RechnungType.
     *
     * @param modified
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * Gets the attributes value for this RechnungType.
     *
     * @return attributes
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this RechnungType.
     *
     * @param attributes
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RechnungType)) return false;
        RechnungType other = (RechnungType) obj;
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
                ((this.art == null && other.getArt() == null) ||
                        (this.art != null &&
                                this.art.equals(other.getArt()))) &&
                ((this.datum == null && other.getDatum() == null) ||
                        (this.datum != null &&
                                this.datum.equals(other.getDatum()))) &&
                ((this.betrag == null && other.getBetrag() == null) ||
                        (this.betrag != null &&
                                this.betrag.equals(other.getBetrag()))) &&
                ((this.status == null && other.getStatus() == null) ||
                        (this.status != null &&
                                this.status.equals(other.getStatus()))) &&
                ((this.waehrung == null && other.getWaehrung() == null) ||
                        (this.waehrung != null &&
                                this.waehrung.equals(other.getWaehrung()))) &&
                ((this.korrekturdatum == null && other.getKorrekturdatum() == null) ||
                        (this.korrekturdatum != null &&
                                this.korrekturdatum.equals(other.getKorrekturdatum()))) &&
                ((this.zahlungszielDatum == null && other.getZahlungszielDatum() == null) ||
                        (this.zahlungszielDatum != null &&
                                this.zahlungszielDatum.equals(other.getZahlungszielDatum()))) &&
                ((this.adresse == null && other.getAdresse() == null) ||
                        (this.adresse != null &&
                                this.adresse.equals(other.getAdresse()))) &&
                ((this.zahlungsziel == null && other.getZahlungsziel() == null) ||
                        (this.zahlungsziel != null &&
                                this.zahlungsziel.equals(other.getZahlungsziel()))) &&
                ((this.emaildatum == null && other.getEmaildatum() == null) ||
                        (this.emaildatum != null &&
                                this.emaildatum.equals(other.getEmaildatum()))) &&
                ((this.emailempfaenger == null && other.getEmailempfaenger() == null) ||
                        (this.emailempfaenger != null &&
                                this.emailempfaenger.equals(other.getEmailempfaenger()))) &&
                ((this.kundenNr == null && other.getKundenNr() == null) ||
                        (this.kundenNr != null &&
                                this.kundenNr.equals(other.getKundenNr()))) &&
                ((this.rechnungspositionListe == null && other.getRechnungspositionListe() == null) ||
                        (this.rechnungspositionListe != null &&
                                java.util.Arrays.equals(this.rechnungspositionListe, other.getRechnungspositionListe()))) &&
                ((this.mahnungListe == null && other.getMahnungListe() == null) ||
                        (this.mahnungListe != null &&
                                java.util.Arrays.equals(this.mahnungListe, other.getMahnungListe()))) &&
                ((this.titel == null && other.getTitel() == null) ||
                        (this.titel != null &&
                                this.titel.equals(other.getTitel()))) &&
                ((this.created == null && other.getCreated() == null) ||
                        (this.created != null &&
                                this.created.equals(other.getCreated()))) &&
                ((this.modified == null && other.getModified() == null) ||
                        (this.modified != null &&
                                this.modified.equals(other.getModified()))) &&
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
        if (getRechnungNr() != null) {
            _hashCode += getRechnungNr().hashCode();
        }
        if (getArt() != null) {
            _hashCode += getArt().hashCode();
        }
        if (getDatum() != null) {
            _hashCode += getDatum().hashCode();
        }
        if (getBetrag() != null) {
            _hashCode += getBetrag().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getWaehrung() != null) {
            _hashCode += getWaehrung().hashCode();
        }
        if (getKorrekturdatum() != null) {
            _hashCode += getKorrekturdatum().hashCode();
        }
        if (getZahlungszielDatum() != null) {
            _hashCode += getZahlungszielDatum().hashCode();
        }
        if (getAdresse() != null) {
            _hashCode += getAdresse().hashCode();
        }
        if (getZahlungsziel() != null) {
            _hashCode += getZahlungsziel().hashCode();
        }
        if (getEmaildatum() != null) {
            _hashCode += getEmaildatum().hashCode();
        }
        if (getEmailempfaenger() != null) {
            _hashCode += getEmailempfaenger().hashCode();
        }
        if (getKundenNr() != null) {
            _hashCode += getKundenNr().hashCode();
        }
        if (getRechnungspositionListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getRechnungspositionListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRechnungspositionListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMahnungListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getMahnungListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getMahnungListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTitel() != null) {
            _hashCode += getTitel().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getModified() != null) {
            _hashCode += getModified().hashCode();
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
