/**
 * ProjektzeitType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Daten einer Zeitbuchung.
 */
public class ProjektzeitType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ProjektzeitType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ProjektzeitType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("datum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("dauer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dauer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("istFakturierbar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "istFakturierbar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("istOrtProjektRelevant");
        elemField.setXmlName(new javax.xml.namespace.QName("", "istOrtProjektRelevant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ort"));
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
        elemField.setFieldName("projektNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vorgangNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vorgangNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taetigkeit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taetigkeit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start");
        elemField.setXmlName(new javax.xml.namespace.QName("", "start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ziel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ziel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("km");
        elemField.setXmlName(new javax.xml.namespace.QName("", "km"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anzahlMitfahrer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anzahlMitfahrer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fahrzeug");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fahrzeug"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ticketNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teilaufgabeNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "teilaufgabeNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reiseRichtung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reiseRichtung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("istPrivatFahrzeug");
        elemField.setXmlName(new javax.xml.namespace.QName("", "istPrivatFahrzeug"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vorgangId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vorgangId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

    /* Die eindeutige Id der Zeitbuchung. Leer bei Anlage, Pflicht
     * bei Update und Löschen. */
    private String id;
    /* Der Anmeldename des Benutzers, dem die Zeitbuchung zugeordnet
     * ist. Pflicht bei Anlage. */
    private String userId;
    /* Das Datum der Zeitbuchung. Pflicht bei Anlage. Format: JJJJ-MM-TT. */
    private String datum;
    /* Die Anfangszeit der Zeitbuchung. Diese muss dem aktuell eingestellten
     * Raster entsprechen. Pflicht bei Anlage. Format: HH:MM. */
    private String von;
    /* Die Ende-Zeit der Zeitbuchung. Diese muss dem aktuell eingestellten
     * Raster entsprechen. Pflicht bei Anlage. Format: HH:MM. */
    private String bis;
    /* Die Dauer der Zeitbuchung. Format: HH:MM. */
    private String dauer;
    /* Flagge, ob die Zeitbuchung fakturierbar ist. */
    private Boolean istFakturierbar;
    /* Flagge, ob der Arbeitsort der Zeitbuchung projektrelevant ist. */
    private Boolean istOrtProjektRelevant;
    /* Der Arbeitsort der Zeitbuchung. */
    private String ort;
    /* Die Bemerkung zur Zeitbuchung. */
    private String bemerkung;
    /* Die Nummer des Projektes, auf das sich die Zeitbuchung bezieht.
     * Pflicht bei Anlage. */
    private String projektNr;
    /* Die Nummer des Vorgangs, auf den sich die Zeitbuchung bezieht.
     * Pflicht bei Anlage. */
    private String vorgangNr;
    /* Die Tätigkeit der Zeitbuchung. Pflicht bei Anlage. */
    private String taetigkeit;
    /* Bei Reise-Buchungen: der Startort der Reise. Pflicht bei Anlage
     * von Reisebuchungen. */
    private String start;
    /* Bei Reise-Buchungen: der Zielort der Reise. Pflicht bei Anlage
     * von Reisebuchungen. */
    private String ziel;
    /* Bei Reise-Buchungen: die gefahrenen Kilometer. */
    private Integer km;
    /* Bei Reise-Buchungen: die Anzahl der Mitfahrer. */
    private Integer anzahlMitfahrer;
    /* Bei Reise-Buchungen: das verwendete Fahrzeug. */
    private String fahrzeug;
    /* Die Nummer des Tickets, auf das sich die Zeitbuchung bezieht. */
    private Integer ticketNr;
    /* Die Nummer der Teilaufgabe, auf die sich die Zeitbuchung bezieht. */
    private String teilaufgabeNr;
    /* Bei Reise-Buchungen. Die Richtung der Reise (Wertebereich:
     * "hin", "weiter", "rueck"). Pflicht bei Anlage von Reisebuchungen. */
    private String reiseRichtung;
    /* Bei Reise-Buchungen: Flagge, ob die Fahrt mit einem Privat-Fahrzeug
     * unternommen wurde. */
    private Boolean istPrivatFahrzeug;
    /* Die technische Id des Vorgangs (nur Lesen). */
    private Integer vorgangId;
    /* Die technische Id des Projekts (nur Lesen). */
    private Integer projektId;
    /* Der Zeitpunkt der Anlage des Objekts. */
    private String created;
    /* Der Zeitpunkt der letzten Änderung des Objekts. */
    private String modified;
    /* Liste von Attributen für kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ProjektzeitType() {
    }


    public ProjektzeitType(
            String id,
            String userId,
            String datum,
            String von,
            String bis,
            String dauer,
            Boolean istFakturierbar,
            Boolean istOrtProjektRelevant,
            String ort,
            String bemerkung,
            String projektNr,
            String vorgangNr,
            String taetigkeit,
            String start,
            String ziel,
            Integer km,
            Integer anzahlMitfahrer,
            String fahrzeug,
            Integer ticketNr,
            String teilaufgabeNr,
            String reiseRichtung,
            Boolean istPrivatFahrzeug,
            Integer vorgangId,
            Integer projektId,
            String created,
            String modified,
            AttributeType[] attributes) {
        this.id = id;
        this.userId = userId;
        this.datum = datum;
        this.von = von;
        this.bis = bis;
        this.dauer = dauer;
        this.istFakturierbar = istFakturierbar;
        this.istOrtProjektRelevant = istOrtProjektRelevant;
        this.ort = ort;
        this.bemerkung = bemerkung;
        this.projektNr = projektNr;
        this.vorgangNr = vorgangNr;
        this.taetigkeit = taetigkeit;
        this.start = start;
        this.ziel = ziel;
        this.km = km;
        this.anzahlMitfahrer = anzahlMitfahrer;
        this.fahrzeug = fahrzeug;
        this.ticketNr = ticketNr;
        this.teilaufgabeNr = teilaufgabeNr;
        this.reiseRichtung = reiseRichtung;
        this.istPrivatFahrzeug = istPrivatFahrzeug;
        this.vorgangId = vorgangId;
        this.projektId = projektId;
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
     * Gets the id value for this ProjektzeitType.
     *
     * @return id   * Die eindeutige Id der Zeitbuchung. Leer bei Anlage, Pflicht
     * bei Update und Löschen.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id value for this ProjektzeitType.
     *
     * @param id   * Die eindeutige Id der Zeitbuchung. Leer bei Anlage, Pflicht
     * bei Update und Löschen.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the userId value for this ProjektzeitType.
     *
     * @return userId   * Der Anmeldename des Benutzers, dem die Zeitbuchung zugeordnet
     * ist. Pflicht bei Anlage.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId value for this ProjektzeitType.
     *
     * @param userId   * Der Anmeldename des Benutzers, dem die Zeitbuchung zugeordnet
     * ist. Pflicht bei Anlage.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the datum value for this ProjektzeitType.
     *
     * @return datum   * Das Datum der Zeitbuchung. Pflicht bei Anlage. Format: JJJJ-MM-TT.
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Sets the datum value for this ProjektzeitType.
     *
     * @param datum   * Das Datum der Zeitbuchung. Pflicht bei Anlage. Format: JJJJ-MM-TT.
     */
    public void setDatum(String datum) {
        this.datum = datum;
    }

    /**
     * Gets the von value for this ProjektzeitType.
     *
     * @return von   * Die Anfangszeit der Zeitbuchung. Diese muss dem aktuell eingestellten
     * Raster entsprechen. Pflicht bei Anlage. Format: HH:MM.
     */
    public String getVon() {
        return von;
    }

    /**
     * Sets the von value for this ProjektzeitType.
     *
     * @param von   * Die Anfangszeit der Zeitbuchung. Diese muss dem aktuell eingestellten
     * Raster entsprechen. Pflicht bei Anlage. Format: HH:MM.
     */
    public void setVon(String von) {
        this.von = von;
    }

    /**
     * Gets the bis value for this ProjektzeitType.
     *
     * @return bis   * Die Ende-Zeit der Zeitbuchung. Diese muss dem aktuell eingestellten
     * Raster entsprechen. Pflicht bei Anlage. Format: HH:MM.
     */
    public String getBis() {
        return bis;
    }

    /**
     * Sets the bis value for this ProjektzeitType.
     *
     * @param bis   * Die Ende-Zeit der Zeitbuchung. Diese muss dem aktuell eingestellten
     * Raster entsprechen. Pflicht bei Anlage. Format: HH:MM.
     */
    public void setBis(String bis) {
        this.bis = bis;
    }

    /**
     * Gets the dauer value for this ProjektzeitType.
     *
     * @return dauer   * Die Dauer der Zeitbuchung. Format: HH:MM.
     */
    public String getDauer() {
        return dauer;
    }

    /**
     * Sets the dauer value for this ProjektzeitType.
     *
     * @param dauer   * Die Dauer der Zeitbuchung. Format: HH:MM.
     */
    public void setDauer(String dauer) {
        this.dauer = dauer;
    }

    /**
     * Gets the istFakturierbar value for this ProjektzeitType.
     *
     * @return istFakturierbar   * Flagge, ob die Zeitbuchung fakturierbar ist.
     */
    public Boolean getIstFakturierbar() {
        return istFakturierbar;
    }

    /**
     * Sets the istFakturierbar value for this ProjektzeitType.
     *
     * @param istFakturierbar   * Flagge, ob die Zeitbuchung fakturierbar ist.
     */
    public void setIstFakturierbar(Boolean istFakturierbar) {
        this.istFakturierbar = istFakturierbar;
    }

    /**
     * Gets the istOrtProjektRelevant value for this ProjektzeitType.
     *
     * @return istOrtProjektRelevant   * Flagge, ob der Arbeitsort der Zeitbuchung projektrelevant ist.
     */
    public Boolean getIstOrtProjektRelevant() {
        return istOrtProjektRelevant;
    }

    /**
     * Sets the istOrtProjektRelevant value for this ProjektzeitType.
     *
     * @param istOrtProjektRelevant   * Flagge, ob der Arbeitsort der Zeitbuchung projektrelevant ist.
     */
    public void setIstOrtProjektRelevant(Boolean istOrtProjektRelevant) {
        this.istOrtProjektRelevant = istOrtProjektRelevant;
    }

    /**
     * Gets the ort value for this ProjektzeitType.
     *
     * @return ort   * Der Arbeitsort der Zeitbuchung.
     */
    public String getOrt() {
        return ort;
    }

    /**
     * Sets the ort value for this ProjektzeitType.
     *
     * @param ort   * Der Arbeitsort der Zeitbuchung.
     */
    public void setOrt(String ort) {
        this.ort = ort;
    }

    /**
     * Gets the bemerkung value for this ProjektzeitType.
     *
     * @return bemerkung   * Die Bemerkung zur Zeitbuchung.
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Sets the bemerkung value for this ProjektzeitType.
     *
     * @param bemerkung   * Die Bemerkung zur Zeitbuchung.
     */
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    /**
     * Gets the projektNr value for this ProjektzeitType.
     *
     * @return projektNr   * Die Nummer des Projektes, auf das sich die Zeitbuchung bezieht.
     * Pflicht bei Anlage.
     */
    public String getProjektNr() {
        return projektNr;
    }

    /**
     * Sets the projektNr value for this ProjektzeitType.
     *
     * @param projektNr   * Die Nummer des Projektes, auf das sich die Zeitbuchung bezieht.
     * Pflicht bei Anlage.
     */
    public void setProjektNr(String projektNr) {
        this.projektNr = projektNr;
    }

    /**
     * Gets the vorgangNr value for this ProjektzeitType.
     *
     * @return vorgangNr   * Die Nummer des Vorgangs, auf den sich die Zeitbuchung bezieht.
     * Pflicht bei Anlage.
     */
    public String getVorgangNr() {
        return vorgangNr;
    }

    /**
     * Sets the vorgangNr value for this ProjektzeitType.
     *
     * @param vorgangNr   * Die Nummer des Vorgangs, auf den sich die Zeitbuchung bezieht.
     * Pflicht bei Anlage.
     */
    public void setVorgangNr(String vorgangNr) {
        this.vorgangNr = vorgangNr;
    }

    /**
     * Gets the taetigkeit value for this ProjektzeitType.
     *
     * @return taetigkeit   * Die Tätigkeit der Zeitbuchung. Pflicht bei Anlage.
     */
    public String getTaetigkeit() {
        return taetigkeit;
    }

    /**
     * Sets the taetigkeit value for this ProjektzeitType.
     *
     * @param taetigkeit   * Die Tätigkeit der Zeitbuchung. Pflicht bei Anlage.
     */
    public void setTaetigkeit(String taetigkeit) {
        this.taetigkeit = taetigkeit;
    }

    /**
     * Gets the start value for this ProjektzeitType.
     *
     * @return start   * Bei Reise-Buchungen: der Startort der Reise. Pflicht bei Anlage
     * von Reisebuchungen.
     */
    public String getStart() {
        return start;
    }

    /**
     * Sets the start value for this ProjektzeitType.
     *
     * @param start   * Bei Reise-Buchungen: der Startort der Reise. Pflicht bei Anlage
     * von Reisebuchungen.
     */
    public void setStart(String start) {
        this.start = start;
    }

    /**
     * Gets the ziel value for this ProjektzeitType.
     *
     * @return ziel   * Bei Reise-Buchungen: der Zielort der Reise. Pflicht bei Anlage
     * von Reisebuchungen.
     */
    public String getZiel() {
        return ziel;
    }

    /**
     * Sets the ziel value for this ProjektzeitType.
     *
     * @param ziel   * Bei Reise-Buchungen: der Zielort der Reise. Pflicht bei Anlage
     * von Reisebuchungen.
     */
    public void setZiel(String ziel) {
        this.ziel = ziel;
    }

    /**
     * Gets the km value for this ProjektzeitType.
     *
     * @return km   * Bei Reise-Buchungen: die gefahrenen Kilometer.
     */
    public Integer getKm() {
        return km;
    }

    /**
     * Sets the km value for this ProjektzeitType.
     *
     * @param km   * Bei Reise-Buchungen: die gefahrenen Kilometer.
     */
    public void setKm(Integer km) {
        this.km = km;
    }

    /**
     * Gets the anzahlMitfahrer value for this ProjektzeitType.
     *
     * @return anzahlMitfahrer   * Bei Reise-Buchungen: die Anzahl der Mitfahrer.
     */
    public Integer getAnzahlMitfahrer() {
        return anzahlMitfahrer;
    }

    /**
     * Sets the anzahlMitfahrer value for this ProjektzeitType.
     *
     * @param anzahlMitfahrer   * Bei Reise-Buchungen: die Anzahl der Mitfahrer.
     */
    public void setAnzahlMitfahrer(Integer anzahlMitfahrer) {
        this.anzahlMitfahrer = anzahlMitfahrer;
    }

    /**
     * Gets the fahrzeug value for this ProjektzeitType.
     *
     * @return fahrzeug   * Bei Reise-Buchungen: das verwendete Fahrzeug.
     */
    public String getFahrzeug() {
        return fahrzeug;
    }

    /**
     * Sets the fahrzeug value for this ProjektzeitType.
     *
     * @param fahrzeug   * Bei Reise-Buchungen: das verwendete Fahrzeug.
     */
    public void setFahrzeug(String fahrzeug) {
        this.fahrzeug = fahrzeug;
    }

    /**
     * Gets the ticketNr value for this ProjektzeitType.
     *
     * @return ticketNr   * Die Nummer des Tickets, auf das sich die Zeitbuchung bezieht.
     */
    public Integer getTicketNr() {
        return ticketNr;
    }

    /**
     * Sets the ticketNr value for this ProjektzeitType.
     *
     * @param ticketNr   * Die Nummer des Tickets, auf das sich die Zeitbuchung bezieht.
     */
    public void setTicketNr(Integer ticketNr) {
        this.ticketNr = ticketNr;
    }

    /**
     * Gets the teilaufgabeNr value for this ProjektzeitType.
     *
     * @return teilaufgabeNr   * Die Nummer der Teilaufgabe, auf die sich die Zeitbuchung bezieht.
     */
    public String getTeilaufgabeNr() {
        return teilaufgabeNr;
    }

    /**
     * Sets the teilaufgabeNr value for this ProjektzeitType.
     *
     * @param teilaufgabeNr   * Die Nummer der Teilaufgabe, auf die sich die Zeitbuchung bezieht.
     */
    public void setTeilaufgabeNr(String teilaufgabeNr) {
        this.teilaufgabeNr = teilaufgabeNr;
    }

    /**
     * Gets the reiseRichtung value for this ProjektzeitType.
     *
     * @return reiseRichtung   * Bei Reise-Buchungen. Die Richtung der Reise (Wertebereich:
     * "hin", "weiter", "rueck"). Pflicht bei Anlage von Reisebuchungen.
     */
    public String getReiseRichtung() {
        return reiseRichtung;
    }

    /**
     * Sets the reiseRichtung value for this ProjektzeitType.
     *
     * @param reiseRichtung   * Bei Reise-Buchungen. Die Richtung der Reise (Wertebereich:
     * "hin", "weiter", "rueck"). Pflicht bei Anlage von Reisebuchungen.
     */
    public void setReiseRichtung(String reiseRichtung) {
        this.reiseRichtung = reiseRichtung;
    }

    /**
     * Gets the istPrivatFahrzeug value for this ProjektzeitType.
     *
     * @return istPrivatFahrzeug   * Bei Reise-Buchungen: Flagge, ob die Fahrt mit einem Privat-Fahrzeug
     * unternommen wurde.
     */
    public Boolean getIstPrivatFahrzeug() {
        return istPrivatFahrzeug;
    }

    /**
     * Sets the istPrivatFahrzeug value for this ProjektzeitType.
     *
     * @param istPrivatFahrzeug   * Bei Reise-Buchungen: Flagge, ob die Fahrt mit einem Privat-Fahrzeug
     * unternommen wurde.
     */
    public void setIstPrivatFahrzeug(Boolean istPrivatFahrzeug) {
        this.istPrivatFahrzeug = istPrivatFahrzeug;
    }

    /**
     * Gets the vorgangId value for this ProjektzeitType.
     *
     * @return vorgangId   * Die technische Id des Vorgangs (nur Lesen).
     */
    public Integer getVorgangId() {
        return vorgangId;
    }

    /**
     * Sets the vorgangId value for this ProjektzeitType.
     *
     * @param vorgangId   * Die technische Id des Vorgangs (nur Lesen).
     */
    public void setVorgangId(Integer vorgangId) {
        this.vorgangId = vorgangId;
    }

    /**
     * Gets the projektId value for this ProjektzeitType.
     *
     * @return projektId   * Die technische Id des Projekts (nur Lesen).
     */
    public Integer getProjektId() {
        return projektId;
    }

    /**
     * Sets the projektId value for this ProjektzeitType.
     *
     * @param projektId   * Die technische Id des Projekts (nur Lesen).
     */
    public void setProjektId(Integer projektId) {
        this.projektId = projektId;
    }

    /**
     * Gets the created value for this ProjektzeitType.
     *
     * @return created   * Der Zeitpunkt der Anlage des Objekts.
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the created value for this ProjektzeitType.
     *
     * @param created   * Der Zeitpunkt der Anlage des Objekts.
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * Gets the modified value for this ProjektzeitType.
     *
     * @return modified   * Der Zeitpunkt der letzten Änderung des Objekts.
     */
    public String getModified() {
        return modified;
    }

    /**
     * Sets the modified value for this ProjektzeitType.
     *
     * @param modified   * Der Zeitpunkt der letzten Änderung des Objekts.
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * Gets the attributes value for this ProjektzeitType.
     *
     * @return attributes   * Liste von Attributen für kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this ProjektzeitType.
     *
     * @param attributes   * Liste von Attributen für kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProjektzeitType)) return false;
        ProjektzeitType other = (ProjektzeitType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.id == null && other.getId() == null) ||
                        (this.id != null &&
                                this.id.equals(other.getId()))) &&
                ((this.userId == null && other.getUserId() == null) ||
                        (this.userId != null &&
                                this.userId.equals(other.getUserId()))) &&
                ((this.datum == null && other.getDatum() == null) ||
                        (this.datum != null &&
                                this.datum.equals(other.getDatum()))) &&
                ((this.von == null && other.getVon() == null) ||
                        (this.von != null &&
                                this.von.equals(other.getVon()))) &&
                ((this.bis == null && other.getBis() == null) ||
                        (this.bis != null &&
                                this.bis.equals(other.getBis()))) &&
                ((this.dauer == null && other.getDauer() == null) ||
                        (this.dauer != null &&
                                this.dauer.equals(other.getDauer()))) &&
                ((this.istFakturierbar == null && other.getIstFakturierbar() == null) ||
                        (this.istFakturierbar != null &&
                                this.istFakturierbar.equals(other.getIstFakturierbar()))) &&
                ((this.istOrtProjektRelevant == null && other.getIstOrtProjektRelevant() == null) ||
                        (this.istOrtProjektRelevant != null &&
                                this.istOrtProjektRelevant.equals(other.getIstOrtProjektRelevant()))) &&
                ((this.ort == null && other.getOrt() == null) ||
                        (this.ort != null &&
                                this.ort.equals(other.getOrt()))) &&
                ((this.bemerkung == null && other.getBemerkung() == null) ||
                        (this.bemerkung != null &&
                                this.bemerkung.equals(other.getBemerkung()))) &&
                ((this.projektNr == null && other.getProjektNr() == null) ||
                        (this.projektNr != null &&
                                this.projektNr.equals(other.getProjektNr()))) &&
                ((this.vorgangNr == null && other.getVorgangNr() == null) ||
                        (this.vorgangNr != null &&
                                this.vorgangNr.equals(other.getVorgangNr()))) &&
                ((this.taetigkeit == null && other.getTaetigkeit() == null) ||
                        (this.taetigkeit != null &&
                                this.taetigkeit.equals(other.getTaetigkeit()))) &&
                ((this.start == null && other.getStart() == null) ||
                        (this.start != null &&
                                this.start.equals(other.getStart()))) &&
                ((this.ziel == null && other.getZiel() == null) ||
                        (this.ziel != null &&
                                this.ziel.equals(other.getZiel()))) &&
                ((this.km == null && other.getKm() == null) ||
                        (this.km != null &&
                                this.km.equals(other.getKm()))) &&
                ((this.anzahlMitfahrer == null && other.getAnzahlMitfahrer() == null) ||
                        (this.anzahlMitfahrer != null &&
                                this.anzahlMitfahrer.equals(other.getAnzahlMitfahrer()))) &&
                ((this.fahrzeug == null && other.getFahrzeug() == null) ||
                        (this.fahrzeug != null &&
                                this.fahrzeug.equals(other.getFahrzeug()))) &&
                ((this.ticketNr == null && other.getTicketNr() == null) ||
                        (this.ticketNr != null &&
                                this.ticketNr.equals(other.getTicketNr()))) &&
                ((this.teilaufgabeNr == null && other.getTeilaufgabeNr() == null) ||
                        (this.teilaufgabeNr != null &&
                                this.teilaufgabeNr.equals(other.getTeilaufgabeNr()))) &&
                ((this.reiseRichtung == null && other.getReiseRichtung() == null) ||
                        (this.reiseRichtung != null &&
                                this.reiseRichtung.equals(other.getReiseRichtung()))) &&
                ((this.istPrivatFahrzeug == null && other.getIstPrivatFahrzeug() == null) ||
                        (this.istPrivatFahrzeug != null &&
                                this.istPrivatFahrzeug.equals(other.getIstPrivatFahrzeug()))) &&
                ((this.vorgangId == null && other.getVorgangId() == null) ||
                        (this.vorgangId != null &&
                                this.vorgangId.equals(other.getVorgangId()))) &&
                ((this.projektId == null && other.getProjektId() == null) ||
                        (this.projektId != null &&
                                this.projektId.equals(other.getProjektId()))) &&
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getDatum() != null) {
            _hashCode += getDatum().hashCode();
        }
        if (getVon() != null) {
            _hashCode += getVon().hashCode();
        }
        if (getBis() != null) {
            _hashCode += getBis().hashCode();
        }
        if (getDauer() != null) {
            _hashCode += getDauer().hashCode();
        }
        if (getIstFakturierbar() != null) {
            _hashCode += getIstFakturierbar().hashCode();
        }
        if (getIstOrtProjektRelevant() != null) {
            _hashCode += getIstOrtProjektRelevant().hashCode();
        }
        if (getOrt() != null) {
            _hashCode += getOrt().hashCode();
        }
        if (getBemerkung() != null) {
            _hashCode += getBemerkung().hashCode();
        }
        if (getProjektNr() != null) {
            _hashCode += getProjektNr().hashCode();
        }
        if (getVorgangNr() != null) {
            _hashCode += getVorgangNr().hashCode();
        }
        if (getTaetigkeit() != null) {
            _hashCode += getTaetigkeit().hashCode();
        }
        if (getStart() != null) {
            _hashCode += getStart().hashCode();
        }
        if (getZiel() != null) {
            _hashCode += getZiel().hashCode();
        }
        if (getKm() != null) {
            _hashCode += getKm().hashCode();
        }
        if (getAnzahlMitfahrer() != null) {
            _hashCode += getAnzahlMitfahrer().hashCode();
        }
        if (getFahrzeug() != null) {
            _hashCode += getFahrzeug().hashCode();
        }
        if (getTicketNr() != null) {
            _hashCode += getTicketNr().hashCode();
        }
        if (getTeilaufgabeNr() != null) {
            _hashCode += getTeilaufgabeNr().hashCode();
        }
        if (getReiseRichtung() != null) {
            _hashCode += getReiseRichtung().hashCode();
        }
        if (getIstPrivatFahrzeug() != null) {
            _hashCode += getIstPrivatFahrzeug().hashCode();
        }
        if (getVorgangId() != null) {
            _hashCode += getVorgangId().hashCode();
        }
        if (getProjektId() != null) {
            _hashCode += getProjektId().hashCode();
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
