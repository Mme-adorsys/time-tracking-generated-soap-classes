/**
 * ProjektDataType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Daten eines Projektes.
 */
public class ProjektDataType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ProjektDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ProjektDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
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
        elemField.setFieldName("kundenNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kundenNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bezeichnung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bezeichnung"));
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
        elemField.setFieldName("startDatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endeDatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endeDatum"));
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
        elemField.setFieldName("planKosten");
        elemField.setXmlName(new javax.xml.namespace.QName("", "planKosten"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planStunden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "planStunden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planArbeitsentgelt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "planArbeitsentgelt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planPauschal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "planPauschal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kostenstelle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kostenstelle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kundenAuftrag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kundenAuftrag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kostentraeger");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kostentraeger"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechenArt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechenArt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ueberbuchung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ueberbuchung"));
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
        elemField.setFieldName("projektbundesland");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektbundesland"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projektland");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektland"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voreinstFakturierbarkeit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "voreinstFakturierbarkeit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("istStunden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "istStunden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("istStundenFakt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "istStundenFakt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
        elemField.setFieldName("kategorieListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kategorieListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "KategorieListeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schlagworteListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schlagworteListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "SchlagwortType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "schlagwort"));
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

    /* Eindeutig und nicht änderbar, es wird in Datenbank automatisch
     * angelegt. */
    private Integer id;
    /* Die Nummer des Projekts. */
    private String projektNr;
    /* Die Nummer des Kunden, dem dieses Projekt zugeordnet ist. Pflicht
     * bei der Anlage. */
    private String kundenNr;
    /* Die Bezeichnung des Projektes. Pflicht beim Anlegen. */
    private String bezeichnung;
    /* Die Abteilung, der das Projekt zugeordnet ist. */
    private String abteilung;
    /* Das Start-Datum des Projekts. Format: JJJJ-MM-TT */
    private String startDatum;
    /* Das Ende-Datum des Projekts. Format: JJJJ-MM-TT */
    private String endeDatum;
    /* Eine Bemerkung zum Projekt. */
    private String bemerkung;
    /* Die geplanten Kosten des Projekts. */
    private Double planKosten;
    /* Die geplanten Stunden des Projekts. */
    private Double planStunden;
    /* Plan Arbeitsentgelt. */
    private Double planArbeitsentgelt;
    /* Der geplante Pauschalpreis des Projekts. */
    private Double planPauschal;
    /* Die Kostenstelle des Projekts (bei Einsatz des Moduls 'Export
     * für Buchhaltung'). */
    private String kostenstelle;
    /* Die Aufragsnummer des Kunden für dieses Projekt. */
    private String kundenAuftrag;
    /* Der Kostenträger des Projekts (bei Einsatz des Moduls 'Export
     * für Buchhaltung'). */
    private String kostentraeger;
    /* Der Status des Projekts. Dieses ist die Kurzbezeichnung eines
     * der in den Stammdaten definierten Status. */
    private String status;
    /* 1=Abrechnung Stundensatz 2=Abrechnung Tagessatz 3=Abrechnung
     * Pauschal */
    private Integer rechenArt;
    /* 0=Überbuchung nicht verhindern. 1=Überbuchung verhindern nur
     * für fakturierbare Zeiten. 2=Überbuchung verhindern alle Zeiten. 3=Fakturierbar
     * ohne Reise. 4=Alle ohne Reise. */
    private Integer ueberbuchung;
    /* Die Projektwährung. */
    private String waehrung;
    private String projektbundesland;
    private String projektland;
    /* 1=Voreinstellung Fakturierbar, durch den Mitarbeiter änderbar
     * 2=Voreinstellung Fakturierbar, durch den Mitarbeiter nicht änderbar
     * 3=Voreinstellung Nicht Fakturierbar, durch den Mitarbeiter änderbar
     * 4=Voreinstellung Nicht Fakturierbar, durch den Mitarbeiter nicht änderbar */
    private Integer voreinstFakturierbarkeit;
    private Float istStunden;
    private Float istStundenFakt;
    /* Der Zeitpunkt der Anlage des Objekts. */
    private String created;
    /* Der Zeitpunkt der letzten Änderung des Objekts. */
    private String modified;
    private KategorieListeType kategorieListe;
    private SchlagwortType[] schlagworteListe;
    /* Liste von Attributen für kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ProjektDataType() {
    }


    public ProjektDataType(
            Integer id,
            String projektNr,
            String kundenNr,
            String bezeichnung,
            String abteilung,
            String startDatum,
            String endeDatum,
            String bemerkung,
            Double planKosten,
            Double planStunden,
            Double planArbeitsentgelt,
            Double planPauschal,
            String kostenstelle,
            String kundenAuftrag,
            String kostentraeger,
            String status,
            Integer rechenArt,
            Integer ueberbuchung,
            String waehrung,
            String projektbundesland,
            String projektland,
            Integer voreinstFakturierbarkeit,
            Float istStunden,
            Float istStundenFakt,
            String created,
            String modified,
            KategorieListeType kategorieListe,
            SchlagwortType[] schlagworteListe,
            AttributeType[] attributes) {
        this.id = id;
        this.projektNr = projektNr;
        this.kundenNr = kundenNr;
        this.bezeichnung = bezeichnung;
        this.abteilung = abteilung;
        this.startDatum = startDatum;
        this.endeDatum = endeDatum;
        this.bemerkung = bemerkung;
        this.planKosten = planKosten;
        this.planStunden = planStunden;
        this.planArbeitsentgelt = planArbeitsentgelt;
        this.planPauschal = planPauschal;
        this.kostenstelle = kostenstelle;
        this.kundenAuftrag = kundenAuftrag;
        this.kostentraeger = kostentraeger;
        this.status = status;
        this.rechenArt = rechenArt;
        this.ueberbuchung = ueberbuchung;
        this.waehrung = waehrung;
        this.projektbundesland = projektbundesland;
        this.projektland = projektland;
        this.voreinstFakturierbarkeit = voreinstFakturierbarkeit;
        this.istStunden = istStunden;
        this.istStundenFakt = istStundenFakt;
        this.created = created;
        this.modified = modified;
        this.kategorieListe = kategorieListe;
        this.schlagworteListe = schlagworteListe;
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
     * Gets the id value for this ProjektDataType.
     *
     * @return id   * Eindeutig und nicht änderbar, es wird in Datenbank automatisch
     * angelegt.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this ProjektDataType.
     *
     * @param id   * Eindeutig und nicht änderbar, es wird in Datenbank automatisch
     * angelegt.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the projektNr value for this ProjektDataType.
     *
     * @return projektNr   * Die Nummer des Projekts.
     */
    public String getProjektNr() {
        return projektNr;
    }

    /**
     * Sets the projektNr value for this ProjektDataType.
     *
     * @param projektNr   * Die Nummer des Projekts.
     */
    public void setProjektNr(String projektNr) {
        this.projektNr = projektNr;
    }

    /**
     * Gets the kundenNr value for this ProjektDataType.
     *
     * @return kundenNr   * Die Nummer des Kunden, dem dieses Projekt zugeordnet ist. Pflicht
     * bei der Anlage.
     */
    public String getKundenNr() {
        return kundenNr;
    }

    /**
     * Sets the kundenNr value for this ProjektDataType.
     *
     * @param kundenNr   * Die Nummer des Kunden, dem dieses Projekt zugeordnet ist. Pflicht
     * bei der Anlage.
     */
    public void setKundenNr(String kundenNr) {
        this.kundenNr = kundenNr;
    }

    /**
     * Gets the bezeichnung value for this ProjektDataType.
     *
     * @return bezeichnung   * Die Bezeichnung des Projektes. Pflicht beim Anlegen.
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the bezeichnung value for this ProjektDataType.
     *
     * @param bezeichnung   * Die Bezeichnung des Projektes. Pflicht beim Anlegen.
     */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
     * Gets the abteilung value for this ProjektDataType.
     *
     * @return abteilung   * Die Abteilung, der das Projekt zugeordnet ist.
     */
    public String getAbteilung() {
        return abteilung;
    }

    /**
     * Sets the abteilung value for this ProjektDataType.
     *
     * @param abteilung   * Die Abteilung, der das Projekt zugeordnet ist.
     */
    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    /**
     * Gets the startDatum value for this ProjektDataType.
     *
     * @return startDatum   * Das Start-Datum des Projekts. Format: JJJJ-MM-TT
     */
    public String getStartDatum() {
        return startDatum;
    }

    /**
     * Sets the startDatum value for this ProjektDataType.
     *
     * @param startDatum   * Das Start-Datum des Projekts. Format: JJJJ-MM-TT
     */
    public void setStartDatum(String startDatum) {
        this.startDatum = startDatum;
    }

    /**
     * Gets the endeDatum value for this ProjektDataType.
     *
     * @return endeDatum   * Das Ende-Datum des Projekts. Format: JJJJ-MM-TT
     */
    public String getEndeDatum() {
        return endeDatum;
    }

    /**
     * Sets the endeDatum value for this ProjektDataType.
     *
     * @param endeDatum   * Das Ende-Datum des Projekts. Format: JJJJ-MM-TT
     */
    public void setEndeDatum(String endeDatum) {
        this.endeDatum = endeDatum;
    }

    /**
     * Gets the bemerkung value for this ProjektDataType.
     *
     * @return bemerkung   * Eine Bemerkung zum Projekt.
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Sets the bemerkung value for this ProjektDataType.
     *
     * @param bemerkung   * Eine Bemerkung zum Projekt.
     */
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    /**
     * Gets the planKosten value for this ProjektDataType.
     *
     * @return planKosten   * Die geplanten Kosten des Projekts.
     */
    public Double getPlanKosten() {
        return planKosten;
    }

    /**
     * Sets the planKosten value for this ProjektDataType.
     *
     * @param planKosten   * Die geplanten Kosten des Projekts.
     */
    public void setPlanKosten(Double planKosten) {
        this.planKosten = planKosten;
    }

    /**
     * Gets the planStunden value for this ProjektDataType.
     *
     * @return planStunden   * Die geplanten Stunden des Projekts.
     */
    public Double getPlanStunden() {
        return planStunden;
    }

    /**
     * Sets the planStunden value for this ProjektDataType.
     *
     * @param planStunden   * Die geplanten Stunden des Projekts.
     */
    public void setPlanStunden(Double planStunden) {
        this.planStunden = planStunden;
    }

    /**
     * Gets the planArbeitsentgelt value for this ProjektDataType.
     *
     * @return planArbeitsentgelt   * Plan Arbeitsentgelt.
     */
    public Double getPlanArbeitsentgelt() {
        return planArbeitsentgelt;
    }

    /**
     * Sets the planArbeitsentgelt value for this ProjektDataType.
     *
     * @param planArbeitsentgelt   * Plan Arbeitsentgelt.
     */
    public void setPlanArbeitsentgelt(Double planArbeitsentgelt) {
        this.planArbeitsentgelt = planArbeitsentgelt;
    }

    /**
     * Gets the planPauschal value for this ProjektDataType.
     *
     * @return planPauschal   * Der geplante Pauschalpreis des Projekts.
     */
    public Double getPlanPauschal() {
        return planPauschal;
    }

    /**
     * Sets the planPauschal value for this ProjektDataType.
     *
     * @param planPauschal   * Der geplante Pauschalpreis des Projekts.
     */
    public void setPlanPauschal(Double planPauschal) {
        this.planPauschal = planPauschal;
    }

    /**
     * Gets the kostenstelle value for this ProjektDataType.
     *
     * @return kostenstelle   * Die Kostenstelle des Projekts (bei Einsatz des Moduls 'Export
     * für Buchhaltung').
     */
    public String getKostenstelle() {
        return kostenstelle;
    }

    /**
     * Sets the kostenstelle value for this ProjektDataType.
     *
     * @param kostenstelle   * Die Kostenstelle des Projekts (bei Einsatz des Moduls 'Export
     * für Buchhaltung').
     */
    public void setKostenstelle(String kostenstelle) {
        this.kostenstelle = kostenstelle;
    }

    /**
     * Gets the kundenAuftrag value for this ProjektDataType.
     *
     * @return kundenAuftrag   * Die Aufragsnummer des Kunden für dieses Projekt.
     */
    public String getKundenAuftrag() {
        return kundenAuftrag;
    }

    /**
     * Sets the kundenAuftrag value for this ProjektDataType.
     *
     * @param kundenAuftrag   * Die Aufragsnummer des Kunden für dieses Projekt.
     */
    public void setKundenAuftrag(String kundenAuftrag) {
        this.kundenAuftrag = kundenAuftrag;
    }

    /**
     * Gets the kostentraeger value for this ProjektDataType.
     *
     * @return kostentraeger   * Der Kostenträger des Projekts (bei Einsatz des Moduls 'Export
     * für Buchhaltung').
     */
    public String getKostentraeger() {
        return kostentraeger;
    }

    /**
     * Sets the kostentraeger value for this ProjektDataType.
     *
     * @param kostentraeger   * Der Kostenträger des Projekts (bei Einsatz des Moduls 'Export
     * für Buchhaltung').
     */
    public void setKostentraeger(String kostentraeger) {
        this.kostentraeger = kostentraeger;
    }

    /**
     * Gets the status value for this ProjektDataType.
     *
     * @return status   * Der Status des Projekts. Dieses ist die Kurzbezeichnung eines
     * der in den Stammdaten definierten Status.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status value for this ProjektDataType.
     *
     * @param status   * Der Status des Projekts. Dieses ist die Kurzbezeichnung eines
     * der in den Stammdaten definierten Status.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets the rechenArt value for this ProjektDataType.
     *
     * @return rechenArt   * 1=Abrechnung Stundensatz 2=Abrechnung Tagessatz 3=Abrechnung
     * Pauschal
     */
    public Integer getRechenArt() {
        return rechenArt;
    }

    /**
     * Sets the rechenArt value for this ProjektDataType.
     *
     * @param rechenArt   * 1=Abrechnung Stundensatz 2=Abrechnung Tagessatz 3=Abrechnung
     * Pauschal
     */
    public void setRechenArt(Integer rechenArt) {
        this.rechenArt = rechenArt;
    }

    /**
     * Gets the ueberbuchung value for this ProjektDataType.
     *
     * @return ueberbuchung   * 0=Überbuchung nicht verhindern. 1=Überbuchung verhindern nur
     * für fakturierbare Zeiten. 2=Überbuchung verhindern alle Zeiten. 3=Fakturierbar
     * ohne Reise. 4=Alle ohne Reise.
     */
    public Integer getUeberbuchung() {
        return ueberbuchung;
    }

    /**
     * Sets the ueberbuchung value for this ProjektDataType.
     *
     * @param ueberbuchung   * 0=Überbuchung nicht verhindern. 1=Überbuchung verhindern nur
     * für fakturierbare Zeiten. 2=Überbuchung verhindern alle Zeiten. 3=Fakturierbar
     * ohne Reise. 4=Alle ohne Reise.
     */
    public void setUeberbuchung(Integer ueberbuchung) {
        this.ueberbuchung = ueberbuchung;
    }

    /**
     * Gets the waehrung value for this ProjektDataType.
     *
     * @return waehrung   * Die Projektwährung.
     */
    public String getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the waehrung value for this ProjektDataType.
     *
     * @param waehrung   * Die Projektwährung.
     */
    public void setWaehrung(String waehrung) {
        this.waehrung = waehrung;
    }

    /**
     * Gets the projektbundesland value for this ProjektDataType.
     *
     * @return projektbundesland
     */
    public String getProjektbundesland() {
        return projektbundesland;
    }

    /**
     * Sets the projektbundesland value for this ProjektDataType.
     *
     * @param projektbundesland
     */
    public void setProjektbundesland(String projektbundesland) {
        this.projektbundesland = projektbundesland;
    }

    /**
     * Gets the projektland value for this ProjektDataType.
     *
     * @return projektland
     */
    public String getProjektland() {
        return projektland;
    }

    /**
     * Sets the projektland value for this ProjektDataType.
     *
     * @param projektland
     */
    public void setProjektland(String projektland) {
        this.projektland = projektland;
    }

    /**
     * Gets the voreinstFakturierbarkeit value for this ProjektDataType.
     *
     * @return voreinstFakturierbarkeit   * 1=Voreinstellung Fakturierbar, durch den Mitarbeiter änderbar
     * 2=Voreinstellung Fakturierbar, durch den Mitarbeiter nicht änderbar
     * 3=Voreinstellung Nicht Fakturierbar, durch den Mitarbeiter änderbar
     * 4=Voreinstellung Nicht Fakturierbar, durch den Mitarbeiter nicht änderbar
     */
    public Integer getVoreinstFakturierbarkeit() {
        return voreinstFakturierbarkeit;
    }

    /**
     * Sets the voreinstFakturierbarkeit value for this ProjektDataType.
     *
     * @param voreinstFakturierbarkeit   * 1=Voreinstellung Fakturierbar, durch den Mitarbeiter änderbar
     * 2=Voreinstellung Fakturierbar, durch den Mitarbeiter nicht änderbar
     * 3=Voreinstellung Nicht Fakturierbar, durch den Mitarbeiter änderbar
     * 4=Voreinstellung Nicht Fakturierbar, durch den Mitarbeiter nicht änderbar
     */
    public void setVoreinstFakturierbarkeit(Integer voreinstFakturierbarkeit) {
        this.voreinstFakturierbarkeit = voreinstFakturierbarkeit;
    }

    /**
     * Gets the istStunden value for this ProjektDataType.
     *
     * @return istStunden
     */
    public Float getIstStunden() {
        return istStunden;
    }

    /**
     * Sets the istStunden value for this ProjektDataType.
     *
     * @param istStunden
     */
    public void setIstStunden(Float istStunden) {
        this.istStunden = istStunden;
    }

    /**
     * Gets the istStundenFakt value for this ProjektDataType.
     *
     * @return istStundenFakt
     */
    public Float getIstStundenFakt() {
        return istStundenFakt;
    }

    /**
     * Sets the istStundenFakt value for this ProjektDataType.
     *
     * @param istStundenFakt
     */
    public void setIstStundenFakt(Float istStundenFakt) {
        this.istStundenFakt = istStundenFakt;
    }

    /**
     * Gets the created value for this ProjektDataType.
     *
     * @return created   * Der Zeitpunkt der Anlage des Objekts.
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the created value for this ProjektDataType.
     *
     * @param created   * Der Zeitpunkt der Anlage des Objekts.
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * Gets the modified value for this ProjektDataType.
     *
     * @return modified   * Der Zeitpunkt der letzten Änderung des Objekts.
     */
    public String getModified() {
        return modified;
    }

    /**
     * Sets the modified value for this ProjektDataType.
     *
     * @param modified   * Der Zeitpunkt der letzten Änderung des Objekts.
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * Gets the kategorieListe value for this ProjektDataType.
     *
     * @return kategorieListe
     */
    public KategorieListeType getKategorieListe() {
        return kategorieListe;
    }

    /**
     * Sets the kategorieListe value for this ProjektDataType.
     *
     * @param kategorieListe
     */
    public void setKategorieListe(KategorieListeType kategorieListe) {
        this.kategorieListe = kategorieListe;
    }

    /**
     * Gets the schlagworteListe value for this ProjektDataType.
     *
     * @return schlagworteListe
     */
    public SchlagwortType[] getSchlagworteListe() {
        return schlagworteListe;
    }

    /**
     * Sets the schlagworteListe value for this ProjektDataType.
     *
     * @param schlagworteListe
     */
    public void setSchlagworteListe(SchlagwortType[] schlagworteListe) {
        this.schlagworteListe = schlagworteListe;
    }

    /**
     * Gets the attributes value for this ProjektDataType.
     *
     * @return attributes   * Liste von Attributen für kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this ProjektDataType.
     *
     * @param attributes   * Liste von Attributen für kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProjektDataType)) return false;
        ProjektDataType other = (ProjektDataType) obj;
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
                ((this.projektNr == null && other.getProjektNr() == null) ||
                        (this.projektNr != null &&
                                this.projektNr.equals(other.getProjektNr()))) &&
                ((this.kundenNr == null && other.getKundenNr() == null) ||
                        (this.kundenNr != null &&
                                this.kundenNr.equals(other.getKundenNr()))) &&
                ((this.bezeichnung == null && other.getBezeichnung() == null) ||
                        (this.bezeichnung != null &&
                                this.bezeichnung.equals(other.getBezeichnung()))) &&
                ((this.abteilung == null && other.getAbteilung() == null) ||
                        (this.abteilung != null &&
                                this.abteilung.equals(other.getAbteilung()))) &&
                ((this.startDatum == null && other.getStartDatum() == null) ||
                        (this.startDatum != null &&
                                this.startDatum.equals(other.getStartDatum()))) &&
                ((this.endeDatum == null && other.getEndeDatum() == null) ||
                        (this.endeDatum != null &&
                                this.endeDatum.equals(other.getEndeDatum()))) &&
                ((this.bemerkung == null && other.getBemerkung() == null) ||
                        (this.bemerkung != null &&
                                this.bemerkung.equals(other.getBemerkung()))) &&
                ((this.planKosten == null && other.getPlanKosten() == null) ||
                        (this.planKosten != null &&
                                this.planKosten.equals(other.getPlanKosten()))) &&
                ((this.planStunden == null && other.getPlanStunden() == null) ||
                        (this.planStunden != null &&
                                this.planStunden.equals(other.getPlanStunden()))) &&
                ((this.planArbeitsentgelt == null && other.getPlanArbeitsentgelt() == null) ||
                        (this.planArbeitsentgelt != null &&
                                this.planArbeitsentgelt.equals(other.getPlanArbeitsentgelt()))) &&
                ((this.planPauschal == null && other.getPlanPauschal() == null) ||
                        (this.planPauschal != null &&
                                this.planPauschal.equals(other.getPlanPauschal()))) &&
                ((this.kostenstelle == null && other.getKostenstelle() == null) ||
                        (this.kostenstelle != null &&
                                this.kostenstelle.equals(other.getKostenstelle()))) &&
                ((this.kundenAuftrag == null && other.getKundenAuftrag() == null) ||
                        (this.kundenAuftrag != null &&
                                this.kundenAuftrag.equals(other.getKundenAuftrag()))) &&
                ((this.kostentraeger == null && other.getKostentraeger() == null) ||
                        (this.kostentraeger != null &&
                                this.kostentraeger.equals(other.getKostentraeger()))) &&
                ((this.status == null && other.getStatus() == null) ||
                        (this.status != null &&
                                this.status.equals(other.getStatus()))) &&
                ((this.rechenArt == null && other.getRechenArt() == null) ||
                        (this.rechenArt != null &&
                                this.rechenArt.equals(other.getRechenArt()))) &&
                ((this.ueberbuchung == null && other.getUeberbuchung() == null) ||
                        (this.ueberbuchung != null &&
                                this.ueberbuchung.equals(other.getUeberbuchung()))) &&
                ((this.waehrung == null && other.getWaehrung() == null) ||
                        (this.waehrung != null &&
                                this.waehrung.equals(other.getWaehrung()))) &&
                ((this.projektbundesland == null && other.getProjektbundesland() == null) ||
                        (this.projektbundesland != null &&
                                this.projektbundesland.equals(other.getProjektbundesland()))) &&
                ((this.projektland == null && other.getProjektland() == null) ||
                        (this.projektland != null &&
                                this.projektland.equals(other.getProjektland()))) &&
                ((this.voreinstFakturierbarkeit == null && other.getVoreinstFakturierbarkeit() == null) ||
                        (this.voreinstFakturierbarkeit != null &&
                                this.voreinstFakturierbarkeit.equals(other.getVoreinstFakturierbarkeit()))) &&
                ((this.istStunden == null && other.getIstStunden() == null) ||
                        (this.istStunden != null &&
                                this.istStunden.equals(other.getIstStunden()))) &&
                ((this.istStundenFakt == null && other.getIstStundenFakt() == null) ||
                        (this.istStundenFakt != null &&
                                this.istStundenFakt.equals(other.getIstStundenFakt()))) &&
                ((this.created == null && other.getCreated() == null) ||
                        (this.created != null &&
                                this.created.equals(other.getCreated()))) &&
                ((this.modified == null && other.getModified() == null) ||
                        (this.modified != null &&
                                this.modified.equals(other.getModified()))) &&
                ((this.kategorieListe == null && other.getKategorieListe() == null) ||
                        (this.kategorieListe != null &&
                                this.kategorieListe.equals(other.getKategorieListe()))) &&
                ((this.schlagworteListe == null && other.getSchlagworteListe() == null) ||
                        (this.schlagworteListe != null &&
                                java.util.Arrays.equals(this.schlagworteListe, other.getSchlagworteListe()))) &&
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
        if (getProjektNr() != null) {
            _hashCode += getProjektNr().hashCode();
        }
        if (getKundenNr() != null) {
            _hashCode += getKundenNr().hashCode();
        }
        if (getBezeichnung() != null) {
            _hashCode += getBezeichnung().hashCode();
        }
        if (getAbteilung() != null) {
            _hashCode += getAbteilung().hashCode();
        }
        if (getStartDatum() != null) {
            _hashCode += getStartDatum().hashCode();
        }
        if (getEndeDatum() != null) {
            _hashCode += getEndeDatum().hashCode();
        }
        if (getBemerkung() != null) {
            _hashCode += getBemerkung().hashCode();
        }
        if (getPlanKosten() != null) {
            _hashCode += getPlanKosten().hashCode();
        }
        if (getPlanStunden() != null) {
            _hashCode += getPlanStunden().hashCode();
        }
        if (getPlanArbeitsentgelt() != null) {
            _hashCode += getPlanArbeitsentgelt().hashCode();
        }
        if (getPlanPauschal() != null) {
            _hashCode += getPlanPauschal().hashCode();
        }
        if (getKostenstelle() != null) {
            _hashCode += getKostenstelle().hashCode();
        }
        if (getKundenAuftrag() != null) {
            _hashCode += getKundenAuftrag().hashCode();
        }
        if (getKostentraeger() != null) {
            _hashCode += getKostentraeger().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getRechenArt() != null) {
            _hashCode += getRechenArt().hashCode();
        }
        if (getUeberbuchung() != null) {
            _hashCode += getUeberbuchung().hashCode();
        }
        if (getWaehrung() != null) {
            _hashCode += getWaehrung().hashCode();
        }
        if (getProjektbundesland() != null) {
            _hashCode += getProjektbundesland().hashCode();
        }
        if (getProjektland() != null) {
            _hashCode += getProjektland().hashCode();
        }
        if (getVoreinstFakturierbarkeit() != null) {
            _hashCode += getVoreinstFakturierbarkeit().hashCode();
        }
        if (getIstStunden() != null) {
            _hashCode += getIstStunden().hashCode();
        }
        if (getIstStundenFakt() != null) {
            _hashCode += getIstStundenFakt().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getModified() != null) {
            _hashCode += getModified().hashCode();
        }
        if (getKategorieListe() != null) {
            _hashCode += getKategorieListe().hashCode();
        }
        if (getSchlagworteListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getSchlagworteListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSchlagworteListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
