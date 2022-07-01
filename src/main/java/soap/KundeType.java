/**
 * KundeType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Daten eines Kunden.
 */
public class KundeType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(KundeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "KundeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kundenNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kundenNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namenszusatz");
        elemField.setXmlName(new javax.xml.namespace.QName("", "namenszusatz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("bemerkung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bemerkung"));
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
        elemField.setFieldName("branche");
        elemField.setXmlName(new javax.xml.namespace.QName("", "branche"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mwst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mwst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iban");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iban"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("www");
        elemField.setXmlName(new javax.xml.namespace.QName("", "www"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
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
        elemField.setFieldName("ustId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ustId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telefon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inaktiv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inaktiv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adressenListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adressenListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AdresseType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "adresse"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ansprechpartnerListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ansprechpartnerListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AnsprechpartnerType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ansprechpartner"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preistabelleListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preistabelleListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "PreistabelleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "preistabelle"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skontofrist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "skontofrist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kundenverantwortlicherListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kundenverantwortlicherListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "KundenverantwortlicherType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "kundenverantwortlicher"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kundenzusatzfelder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kundenzusatzfelder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ZusatzfelderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kategorieListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kategorieListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "KategorieListeType"));
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

    /* Die Kundennummer. Pflicht bei Anlage, Update und Löschen.
     * Wenn die Nummernkreis in der Kunde-Einstellungen definiert ist und
     * dies beutzt werden soll, dann bitte bei Anlage leer lassen. */
    private String kundenNr;
    /* Der Name des Kunden. Pflicht bei der Anlage eines neuen Kunden. */
    private String name;
    private String namenszusatz;
    /* Die Währung des Kunden (Währungssysmbol, z. B. EUR). */
    private String waehrung;
    /* Eine Bemerkung zum Kunden. */
    private String bemerkung;
    /* Die Abteilung, der der Kunde zugeordnet werden soll. Bei der
     * Kundenanlage muss diese bereits in ZEP vorhanden sein. */
    private String abteilung;
    /* Die Branche, die dem Kunden zugeordnet ist. Bei der Kundenanlage
     * muss diese bereits in ZEP vorhanden sein. */
    private String branche;
    /* Der MsWt-Satz des Kunden. */
    private Double mwst;
    /* Die BIC des Kunden. */
    private String bic;
    /* Die IBAN des Kunden. */
    private String iban;
    /* Die Fax-Nummer des Kunden */
    private String fax;
    /* Der URL der Web-Site des Kunden. Der URL muss ggf. als CDATA
     * angegeben werden. */
    private String www;
    /* Die EMail-Adresse des Kunden. */
    private String email;
    /* Das dem Kunden eingeräumte Zahlungsziel. */
    private Integer zahlungsziel;
    /* Die USt.Id-Nr des Kunden. */
    private String ustId;
    /* Die Telefonnummer des Kunden. */
    private String telefon;
    /* Kennung, ob der Kunde aktiv oder inaktiv ist. */
    private Boolean inaktiv;
    /* Die Liste der Adressen des Kunden. */
    private AdresseType[] adressenListe;
    /* Die Liste der Ansprechpartner des Kunden. */
    private AnsprechpartnerType[] ansprechpartnerListe;
    /* Die Liste der Preistabellen des Kunden. */
    private PreistabelleType[] preistabelleListe;
    /* Skontofrist in Tagen. */
    private Integer skontofrist;
    /* Hier wird die userId erwartet (optional) */
    private KundenverantwortlicherType[] kundenverantwortlicherListe;
    private ZusatzfelderType kundenzusatzfelder;
    private KategorieListeType kategorieListe;
    /* Der Zeitpunkt der Anlage des Objekts. */
    private String created;
    /* Der Zeitpunkt der letzten Änderung des Objekts. */
    private String modified;
    /* Liste von Attributen für kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public KundeType() {
    }


    public KundeType(
            String kundenNr,
            String name,
            String namenszusatz,
            String waehrung,
            String bemerkung,
            String abteilung,
            String branche,
            Double mwst,
            String bic,
            String iban,
            String fax,
            String www,
            String email,
            Integer zahlungsziel,
            String ustId,
            String telefon,
            Boolean inaktiv,
            AdresseType[] adressenListe,
            AnsprechpartnerType[] ansprechpartnerListe,
            PreistabelleType[] preistabelleListe,
            Integer skontofrist,
            KundenverantwortlicherType[] kundenverantwortlicherListe,
            ZusatzfelderType kundenzusatzfelder,
            KategorieListeType kategorieListe,
            String created,
            String modified,
            AttributeType[] attributes) {
        this.kundenNr = kundenNr;
        this.name = name;
        this.namenszusatz = namenszusatz;
        this.waehrung = waehrung;
        this.bemerkung = bemerkung;
        this.abteilung = abteilung;
        this.branche = branche;
        this.mwst = mwst;
        this.bic = bic;
        this.iban = iban;
        this.fax = fax;
        this.www = www;
        this.email = email;
        this.zahlungsziel = zahlungsziel;
        this.ustId = ustId;
        this.telefon = telefon;
        this.inaktiv = inaktiv;
        this.adressenListe = adressenListe;
        this.ansprechpartnerListe = ansprechpartnerListe;
        this.preistabelleListe = preistabelleListe;
        this.skontofrist = skontofrist;
        this.kundenverantwortlicherListe = kundenverantwortlicherListe;
        this.kundenzusatzfelder = kundenzusatzfelder;
        this.kategorieListe = kategorieListe;
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
     * Gets the kundenNr value for this KundeType.
     *
     * @return kundenNr   * Die Kundennummer. Pflicht bei Anlage, Update und Löschen.
     * Wenn die Nummernkreis in der Kunde-Einstellungen definiert ist und
     * dies beutzt werden soll, dann bitte bei Anlage leer lassen.
     */
    public String getKundenNr() {
        return kundenNr;
    }

    /**
     * Sets the kundenNr value for this KundeType.
     *
     * @param kundenNr   * Die Kundennummer. Pflicht bei Anlage, Update und Löschen.
     * Wenn die Nummernkreis in der Kunde-Einstellungen definiert ist und
     * dies beutzt werden soll, dann bitte bei Anlage leer lassen.
     */
    public void setKundenNr(String kundenNr) {
        this.kundenNr = kundenNr;
    }

    /**
     * Gets the name value for this KundeType.
     *
     * @return name   * Der Name des Kunden. Pflicht bei der Anlage eines neuen Kunden.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name value for this KundeType.
     *
     * @param name   * Der Name des Kunden. Pflicht bei der Anlage eines neuen Kunden.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the namenszusatz value for this KundeType.
     *
     * @return namenszusatz
     */
    public String getNamenszusatz() {
        return namenszusatz;
    }

    /**
     * Sets the namenszusatz value for this KundeType.
     *
     * @param namenszusatz
     */
    public void setNamenszusatz(String namenszusatz) {
        this.namenszusatz = namenszusatz;
    }

    /**
     * Gets the waehrung value for this KundeType.
     *
     * @return waehrung   * Die Währung des Kunden (Währungssysmbol, z. B. EUR).
     */
    public String getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the waehrung value for this KundeType.
     *
     * @param waehrung   * Die Währung des Kunden (Währungssysmbol, z. B. EUR).
     */
    public void setWaehrung(String waehrung) {
        this.waehrung = waehrung;
    }

    /**
     * Gets the bemerkung value for this KundeType.
     *
     * @return bemerkung   * Eine Bemerkung zum Kunden.
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Sets the bemerkung value for this KundeType.
     *
     * @param bemerkung   * Eine Bemerkung zum Kunden.
     */
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    /**
     * Gets the abteilung value for this KundeType.
     *
     * @return abteilung   * Die Abteilung, der der Kunde zugeordnet werden soll. Bei der
     * Kundenanlage muss diese bereits in ZEP vorhanden sein.
     */
    public String getAbteilung() {
        return abteilung;
    }

    /**
     * Sets the abteilung value for this KundeType.
     *
     * @param abteilung   * Die Abteilung, der der Kunde zugeordnet werden soll. Bei der
     * Kundenanlage muss diese bereits in ZEP vorhanden sein.
     */
    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    /**
     * Gets the branche value for this KundeType.
     *
     * @return branche   * Die Branche, die dem Kunden zugeordnet ist. Bei der Kundenanlage
     * muss diese bereits in ZEP vorhanden sein.
     */
    public String getBranche() {
        return branche;
    }

    /**
     * Sets the branche value for this KundeType.
     *
     * @param branche   * Die Branche, die dem Kunden zugeordnet ist. Bei der Kundenanlage
     * muss diese bereits in ZEP vorhanden sein.
     */
    public void setBranche(String branche) {
        this.branche = branche;
    }

    /**
     * Gets the mwst value for this KundeType.
     *
     * @return mwst   * Der MsWt-Satz des Kunden.
     */
    public Double getMwst() {
        return mwst;
    }

    /**
     * Sets the mwst value for this KundeType.
     *
     * @param mwst   * Der MsWt-Satz des Kunden.
     */
    public void setMwst(Double mwst) {
        this.mwst = mwst;
    }

    /**
     * Gets the bic value for this KundeType.
     *
     * @return bic   * Die BIC des Kunden.
     */
    public String getBic() {
        return bic;
    }

    /**
     * Sets the bic value for this KundeType.
     *
     * @param bic   * Die BIC des Kunden.
     */
    public void setBic(String bic) {
        this.bic = bic;
    }

    /**
     * Gets the iban value for this KundeType.
     *
     * @return iban   * Die IBAN des Kunden.
     */
    public String getIban() {
        return iban;
    }

    /**
     * Sets the iban value for this KundeType.
     *
     * @param iban   * Die IBAN des Kunden.
     */
    public void setIban(String iban) {
        this.iban = iban;
    }

    /**
     * Gets the fax value for this KundeType.
     *
     * @return fax   * Die Fax-Nummer des Kunden
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the fax value for this KundeType.
     *
     * @param fax   * Die Fax-Nummer des Kunden
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * Gets the www value for this KundeType.
     *
     * @return www   * Der URL der Web-Site des Kunden. Der URL muss ggf. als CDATA
     * angegeben werden.
     */
    public String getWww() {
        return www;
    }

    /**
     * Sets the www value for this KundeType.
     *
     * @param www   * Der URL der Web-Site des Kunden. Der URL muss ggf. als CDATA
     * angegeben werden.
     */
    public void setWww(String www) {
        this.www = www;
    }

    /**
     * Gets the email value for this KundeType.
     *
     * @return email   * Die EMail-Adresse des Kunden.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email value for this KundeType.
     *
     * @param email   * Die EMail-Adresse des Kunden.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the zahlungsziel value for this KundeType.
     *
     * @return zahlungsziel   * Das dem Kunden eingeräumte Zahlungsziel.
     */
    public Integer getZahlungsziel() {
        return zahlungsziel;
    }

    /**
     * Sets the zahlungsziel value for this KundeType.
     *
     * @param zahlungsziel   * Das dem Kunden eingeräumte Zahlungsziel.
     */
    public void setZahlungsziel(Integer zahlungsziel) {
        this.zahlungsziel = zahlungsziel;
    }

    /**
     * Gets the ustId value for this KundeType.
     *
     * @return ustId   * Die USt.Id-Nr des Kunden.
     */
    public String getUstId() {
        return ustId;
    }

    /**
     * Sets the ustId value for this KundeType.
     *
     * @param ustId   * Die USt.Id-Nr des Kunden.
     */
    public void setUstId(String ustId) {
        this.ustId = ustId;
    }

    /**
     * Gets the telefon value for this KundeType.
     *
     * @return telefon   * Die Telefonnummer des Kunden.
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * Sets the telefon value for this KundeType.
     *
     * @param telefon   * Die Telefonnummer des Kunden.
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    /**
     * Gets the inaktiv value for this KundeType.
     *
     * @return inaktiv   * Kennung, ob der Kunde aktiv oder inaktiv ist.
     */
    public Boolean getInaktiv() {
        return inaktiv;
    }

    /**
     * Sets the inaktiv value for this KundeType.
     *
     * @param inaktiv   * Kennung, ob der Kunde aktiv oder inaktiv ist.
     */
    public void setInaktiv(Boolean inaktiv) {
        this.inaktiv = inaktiv;
    }

    /**
     * Gets the adressenListe value for this KundeType.
     *
     * @return adressenListe   * Die Liste der Adressen des Kunden.
     */
    public AdresseType[] getAdressenListe() {
        return adressenListe;
    }

    /**
     * Sets the adressenListe value for this KundeType.
     *
     * @param adressenListe   * Die Liste der Adressen des Kunden.
     */
    public void setAdressenListe(AdresseType[] adressenListe) {
        this.adressenListe = adressenListe;
    }

    /**
     * Gets the ansprechpartnerListe value for this KundeType.
     *
     * @return ansprechpartnerListe   * Die Liste der Ansprechpartner des Kunden.
     */
    public AnsprechpartnerType[] getAnsprechpartnerListe() {
        return ansprechpartnerListe;
    }

    /**
     * Sets the ansprechpartnerListe value for this KundeType.
     *
     * @param ansprechpartnerListe   * Die Liste der Ansprechpartner des Kunden.
     */
    public void setAnsprechpartnerListe(AnsprechpartnerType[] ansprechpartnerListe) {
        this.ansprechpartnerListe = ansprechpartnerListe;
    }

    /**
     * Gets the preistabelleListe value for this KundeType.
     *
     * @return preistabelleListe   * Die Liste der Preistabellen des Kunden.
     */
    public PreistabelleType[] getPreistabelleListe() {
        return preistabelleListe;
    }

    /**
     * Sets the preistabelleListe value for this KundeType.
     *
     * @param preistabelleListe   * Die Liste der Preistabellen des Kunden.
     */
    public void setPreistabelleListe(PreistabelleType[] preistabelleListe) {
        this.preistabelleListe = preistabelleListe;
    }

    /**
     * Gets the skontofrist value for this KundeType.
     *
     * @return skontofrist   * Skontofrist in Tagen.
     */
    public Integer getSkontofrist() {
        return skontofrist;
    }

    /**
     * Sets the skontofrist value for this KundeType.
     *
     * @param skontofrist   * Skontofrist in Tagen.
     */
    public void setSkontofrist(Integer skontofrist) {
        this.skontofrist = skontofrist;
    }

    /**
     * Gets the kundenverantwortlicherListe value for this KundeType.
     *
     * @return kundenverantwortlicherListe   * Hier wird die userId erwartet (optional)
     */
    public KundenverantwortlicherType[] getKundenverantwortlicherListe() {
        return kundenverantwortlicherListe;
    }

    /**
     * Sets the kundenverantwortlicherListe value for this KundeType.
     *
     * @param kundenverantwortlicherListe   * Hier wird die userId erwartet (optional)
     */
    public void setKundenverantwortlicherListe(KundenverantwortlicherType[] kundenverantwortlicherListe) {
        this.kundenverantwortlicherListe = kundenverantwortlicherListe;
    }

    /**
     * Gets the kundenzusatzfelder value for this KundeType.
     *
     * @return kundenzusatzfelder
     */
    public ZusatzfelderType getKundenzusatzfelder() {
        return kundenzusatzfelder;
    }

    /**
     * Sets the kundenzusatzfelder value for this KundeType.
     *
     * @param kundenzusatzfelder
     */
    public void setKundenzusatzfelder(ZusatzfelderType kundenzusatzfelder) {
        this.kundenzusatzfelder = kundenzusatzfelder;
    }

    /**
     * Gets the kategorieListe value for this KundeType.
     *
     * @return kategorieListe
     */
    public KategorieListeType getKategorieListe() {
        return kategorieListe;
    }

    /**
     * Sets the kategorieListe value for this KundeType.
     *
     * @param kategorieListe
     */
    public void setKategorieListe(KategorieListeType kategorieListe) {
        this.kategorieListe = kategorieListe;
    }

    /**
     * Gets the created value for this KundeType.
     *
     * @return created   * Der Zeitpunkt der Anlage des Objekts.
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the created value for this KundeType.
     *
     * @param created   * Der Zeitpunkt der Anlage des Objekts.
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * Gets the modified value for this KundeType.
     *
     * @return modified   * Der Zeitpunkt der letzten Änderung des Objekts.
     */
    public String getModified() {
        return modified;
    }

    /**
     * Sets the modified value for this KundeType.
     *
     * @param modified   * Der Zeitpunkt der letzten Änderung des Objekts.
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * Gets the attributes value for this KundeType.
     *
     * @return attributes   * Liste von Attributen für kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this KundeType.
     *
     * @param attributes   * Liste von Attributen für kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof KundeType)) return false;
        KundeType other = (KundeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.kundenNr == null && other.getKundenNr() == null) ||
                        (this.kundenNr != null &&
                                this.kundenNr.equals(other.getKundenNr()))) &&
                ((this.name == null && other.getName() == null) ||
                        (this.name != null &&
                                this.name.equals(other.getName()))) &&
                ((this.namenszusatz == null && other.getNamenszusatz() == null) ||
                        (this.namenszusatz != null &&
                                this.namenszusatz.equals(other.getNamenszusatz()))) &&
                ((this.waehrung == null && other.getWaehrung() == null) ||
                        (this.waehrung != null &&
                                this.waehrung.equals(other.getWaehrung()))) &&
                ((this.bemerkung == null && other.getBemerkung() == null) ||
                        (this.bemerkung != null &&
                                this.bemerkung.equals(other.getBemerkung()))) &&
                ((this.abteilung == null && other.getAbteilung() == null) ||
                        (this.abteilung != null &&
                                this.abteilung.equals(other.getAbteilung()))) &&
                ((this.branche == null && other.getBranche() == null) ||
                        (this.branche != null &&
                                this.branche.equals(other.getBranche()))) &&
                ((this.mwst == null && other.getMwst() == null) ||
                        (this.mwst != null &&
                                this.mwst.equals(other.getMwst()))) &&
                ((this.bic == null && other.getBic() == null) ||
                        (this.bic != null &&
                                this.bic.equals(other.getBic()))) &&
                ((this.iban == null && other.getIban() == null) ||
                        (this.iban != null &&
                                this.iban.equals(other.getIban()))) &&
                ((this.fax == null && other.getFax() == null) ||
                        (this.fax != null &&
                                this.fax.equals(other.getFax()))) &&
                ((this.www == null && other.getWww() == null) ||
                        (this.www != null &&
                                this.www.equals(other.getWww()))) &&
                ((this.email == null && other.getEmail() == null) ||
                        (this.email != null &&
                                this.email.equals(other.getEmail()))) &&
                ((this.zahlungsziel == null && other.getZahlungsziel() == null) ||
                        (this.zahlungsziel != null &&
                                this.zahlungsziel.equals(other.getZahlungsziel()))) &&
                ((this.ustId == null && other.getUstId() == null) ||
                        (this.ustId != null &&
                                this.ustId.equals(other.getUstId()))) &&
                ((this.telefon == null && other.getTelefon() == null) ||
                        (this.telefon != null &&
                                this.telefon.equals(other.getTelefon()))) &&
                ((this.inaktiv == null && other.getInaktiv() == null) ||
                        (this.inaktiv != null &&
                                this.inaktiv.equals(other.getInaktiv()))) &&
                ((this.adressenListe == null && other.getAdressenListe() == null) ||
                        (this.adressenListe != null &&
                                java.util.Arrays.equals(this.adressenListe, other.getAdressenListe()))) &&
                ((this.ansprechpartnerListe == null && other.getAnsprechpartnerListe() == null) ||
                        (this.ansprechpartnerListe != null &&
                                java.util.Arrays.equals(this.ansprechpartnerListe, other.getAnsprechpartnerListe()))) &&
                ((this.preistabelleListe == null && other.getPreistabelleListe() == null) ||
                        (this.preistabelleListe != null &&
                                java.util.Arrays.equals(this.preistabelleListe, other.getPreistabelleListe()))) &&
                ((this.skontofrist == null && other.getSkontofrist() == null) ||
                        (this.skontofrist != null &&
                                this.skontofrist.equals(other.getSkontofrist()))) &&
                ((this.kundenverantwortlicherListe == null && other.getKundenverantwortlicherListe() == null) ||
                        (this.kundenverantwortlicherListe != null &&
                                java.util.Arrays.equals(this.kundenverantwortlicherListe, other.getKundenverantwortlicherListe()))) &&
                ((this.kundenzusatzfelder == null && other.getKundenzusatzfelder() == null) ||
                        (this.kundenzusatzfelder != null &&
                                this.kundenzusatzfelder.equals(other.getKundenzusatzfelder()))) &&
                ((this.kategorieListe == null && other.getKategorieListe() == null) ||
                        (this.kategorieListe != null &&
                                this.kategorieListe.equals(other.getKategorieListe()))) &&
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
        if (getKundenNr() != null) {
            _hashCode += getKundenNr().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNamenszusatz() != null) {
            _hashCode += getNamenszusatz().hashCode();
        }
        if (getWaehrung() != null) {
            _hashCode += getWaehrung().hashCode();
        }
        if (getBemerkung() != null) {
            _hashCode += getBemerkung().hashCode();
        }
        if (getAbteilung() != null) {
            _hashCode += getAbteilung().hashCode();
        }
        if (getBranche() != null) {
            _hashCode += getBranche().hashCode();
        }
        if (getMwst() != null) {
            _hashCode += getMwst().hashCode();
        }
        if (getBic() != null) {
            _hashCode += getBic().hashCode();
        }
        if (getIban() != null) {
            _hashCode += getIban().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getWww() != null) {
            _hashCode += getWww().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getZahlungsziel() != null) {
            _hashCode += getZahlungsziel().hashCode();
        }
        if (getUstId() != null) {
            _hashCode += getUstId().hashCode();
        }
        if (getTelefon() != null) {
            _hashCode += getTelefon().hashCode();
        }
        if (getInaktiv() != null) {
            _hashCode += getInaktiv().hashCode();
        }
        if (getAdressenListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAdressenListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAdressenListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAnsprechpartnerListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAnsprechpartnerListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAnsprechpartnerListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPreistabelleListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getPreistabelleListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPreistabelleListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSkontofrist() != null) {
            _hashCode += getSkontofrist().hashCode();
        }
        if (getKundenverantwortlicherListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getKundenverantwortlicherListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getKundenverantwortlicherListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKundenzusatzfelder() != null) {
            _hashCode += getKundenzusatzfelder().hashCode();
        }
        if (getKategorieListe() != null) {
            _hashCode += getKategorieListe().hashCode();
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
