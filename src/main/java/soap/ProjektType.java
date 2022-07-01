/**
 * ProjektType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Daten eines Projektes.
 */
public class ProjektType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ProjektType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ProjektType"));
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
        elemField.setFieldName("dynamischePlanKosten");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dynamischePlanKosten"));
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
        elemField.setFieldName("dynamischePlanStunden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dynamischePlanStunden"));
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
        elemField.setFieldName("dynamischePlanArbeitsentgelt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dynamischePlanArbeitsentgelt"));
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
        elemField.setFieldName("projektortListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektortListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ProjektortType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ort"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vorgangListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vorgangListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "VorgangType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "vorgang"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projektmitarbeiterListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektmitarbeiterListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ProjektMitarbeiterType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "projektmitarbeiter"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projekttaetigkeitListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projekttaetigkeitListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ProjekttaetigkeitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "taetigkeit"));
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
        elemField.setFieldName("defaultFakt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultFakt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("projekttagessatzListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projekttagessatzListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "TagessatzanteilType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "tagessatzanteil"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kundenansprechpartner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kundenansprechpartner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AnsprechpartnerType"));
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
        elemField.setFieldName("projektzusatzfelder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektzusatzfelder"));
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
        elemField.setFieldName("schlagworteListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schlagworteListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "SchlagwortType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "schlagwort"));
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
        elemField.setFieldName("sprache");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sprache"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vorgaengeEinzelnAbrechnen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vorgaengeEinzelnAbrechnen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belegeinstellungen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belegeinstellungen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "BelegeinstellungenType"));
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

    private Integer id;
    /* Die Nummer des Projekts. Wenn die
     *                 				Nummernkreis in der
     *                 				Projekt-Einstellungen definiert ist und
     *                 				dies beutzt werden soll, dann bitte bei
     *                 				Anlage leer lassen. */
    private String projektNr;
    /* Die Nummer des Kunden, dem dieses
     *                 				Projekt zugeordnet ist. Pflicht bei der
     *                 				Anlage. */
    private String kundenNr;
    /* Die Bezeichnung des Projektes. Pflicht
     *                 				beim Anlegen. */
    private String bezeichnung;
    /* Die Abteilung, der das Projekt
     *                 				zugeordnet ist. */
    private String abteilung;
    /* Das Start-Datum des Projekts. Format:
     *                 				JJJJ-MM-TT */
    private String startDatum;
    /* Das Ende-Datum des Projekts. Format:
     *                 				JJJJ-MM-TT */
    private String endeDatum;
    /* Eine Bemerkung zum Projekt. */
    private String bemerkung;
    /* Die geplanten Kosten des Projekts. */
    private Double planKosten;
    private Double dynamischePlanKosten;
    /* Die geplanten Stunden des Projekts. */
    private Double planStunden;
    private Double dynamischePlanStunden;
    /* Plan Arbeitsentgelt. */
    private Double planArbeitsentgelt;
    private Double dynamischePlanArbeitsentgelt;
    /* Der geplante Pauschalpreis des Projekts. */
    private Double planPauschal;
    /* Die Kostenstelle des Projekts (bei
     *                 				Einsatz des Moduls 'Export für
     *                 				Buchhaltung'). */
    private String kostenstelle;
    /* Die Aufragsnummer des Kunden für dieses
     *                 				Projekt. */
    private String kundenAuftrag;
    /* Der Kostenträger des Projekts (bei
     *                 				Einsatz des Moduls 'Export für
     *                 				Buchhaltung'). */
    private String kostentraeger;
    /* Der Status des Projekts. Dieses ist die
     *                 				Kurzbezeichnung eines der in den
     *                 				Stammdaten definierten Status. */
    private String status;
    /* Die Liste der Projektorte. */
    private ProjektortType[] projektortListe;
    /* Die Liste der Vorgänge des Projekts. */
    private VorgangType[] vorgangListe;
    /* Die Liste der Projektmitarbeiter. */
    private ProjektMitarbeiterType[] projektmitarbeiterListe;
    /* Die Liste der projektspezifischen
     *                 				Tätigkeiten. */
    private ProjekttaetigkeitType[] projekttaetigkeitListe;
    /* Die Liste der Projekt-Preistabellen des
     *                 				Projekts. */
    private PreistabelleType[] preistabelleListe;
    /* 1=Fakturierbar änderbar(durchMitarbeiter
     *                 				) 2=Fakturierbar nicht änderbar (durch
     *                 				Mitarbeiter) 3=Nicht fakturierbar
     *                 				änderbar (durch Mitarbeiter) 4=Nicht
     *                 				fakturierbar nciht änderbar (durch
     *                 				Mitarbeiter ) */
    private Integer defaultFakt;
    /* 1=Abrechnung Stundensatz 2=Abrechnung
     *                 				Tagessatz 3=Abrechnung Pauschal */
    private Integer rechenArt;
    /* 0=Überbuchung nicht verhindern.
     *                 				1=Überbuchung verhindern nur für
     *                 				fakturierbare Zeiten. 2=Überbuchung
     *                 				verhindern alle Zeiten. 3=Fakturierbar
     *                 				ohne Reise. 4=Alle ohne Reise. */
    private Integer ueberbuchung;
    /* Die Projektwährung. */
    private String waehrung;
    private String projektbundesland;
    private String projektland;
    private TagessatzanteilType[] projekttagessatzListe;
    /* Dieser soll der Benutzername von
     *                 				Kundenansprechpartner sein, wenn nicht
     *                 				vorhanden dann bleibt leer */
    private AnsprechpartnerType kundenansprechpartner;
    /* 1=Voreinstellung Fakturierbar, durch den
     *                 				Mitarbeiter änderbar 2=Voreinstellung
     *                 				Fakturierbar, durch den Mitarbeiter
     *                 				nicht änderbar 3=Voreinstellung Nicht
     *                 				Fakturierbar, durch den Mitarbeiter
     *                 				änderbar 4=Voreinstellung Nicht
     *                 				Fakturierbar, durch den Mitarbeiter
     *                 				nicht änderbar */
    private Integer voreinstFakturierbarkeit;
    private ZusatzfelderType projektzusatzfelder;
    private KategorieListeType kategorieListe;
    private SchlagwortType[] schlagworteListe;
    private Float istStunden;
    private Float istStundenFakt;
    /* Leer = ZEP-Standarsprache de : deutsch
     *                 				en : englisch fr : französisch de_at :
     *                 				deutsch-Österreich de_ch :
     *                 				deutsch-Schweitz en_de : englisch mit
     *                 				deutscher Formatierung en_eu :
     *                 				englisch-Europa en_gb :
     *                 				englisch-Großbritannien en_us :
     *                 				englisch-USA fr_de : französisch mit
     *                 				deutscher Formatierung fr_ch :
     *                 				französisch-Schweitz */
    private String sprache;
    private String url;
    /* Vorgänge werden einzeln abgerechnet */
    private Boolean vorgaengeEinzelnAbrechnen;
    private BelegeinstellungenType belegeinstellungen;
    /* Der Zeitpunkt der Anlage des Objekts. */
    private String created;
    /* Der Zeitpunkt der letzten Änderung des
     *                 				Objekts. */
    private String modified;
    /* Liste von Attributen für
     *                 				kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ProjektType() {
    }


    public ProjektType(
            Integer id,
            String projektNr,
            String kundenNr,
            String bezeichnung,
            String abteilung,
            String startDatum,
            String endeDatum,
            String bemerkung,
            Double planKosten,
            Double dynamischePlanKosten,
            Double planStunden,
            Double dynamischePlanStunden,
            Double planArbeitsentgelt,
            Double dynamischePlanArbeitsentgelt,
            Double planPauschal,
            String kostenstelle,
            String kundenAuftrag,
            String kostentraeger,
            String status,
            ProjektortType[] projektortListe,
            VorgangType[] vorgangListe,
            ProjektMitarbeiterType[] projektmitarbeiterListe,
            ProjekttaetigkeitType[] projekttaetigkeitListe,
            PreistabelleType[] preistabelleListe,
            Integer defaultFakt,
            Integer rechenArt,
            Integer ueberbuchung,
            String waehrung,
            String projektbundesland,
            String projektland,
            TagessatzanteilType[] projekttagessatzListe,
            AnsprechpartnerType kundenansprechpartner,
            Integer voreinstFakturierbarkeit,
            ZusatzfelderType projektzusatzfelder,
            KategorieListeType kategorieListe,
            SchlagwortType[] schlagworteListe,
            Float istStunden,
            Float istStundenFakt,
            String sprache,
            String url,
            Boolean vorgaengeEinzelnAbrechnen,
            BelegeinstellungenType belegeinstellungen,
            String created,
            String modified,
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
        this.dynamischePlanKosten = dynamischePlanKosten;
        this.planStunden = planStunden;
        this.dynamischePlanStunden = dynamischePlanStunden;
        this.planArbeitsentgelt = planArbeitsentgelt;
        this.dynamischePlanArbeitsentgelt = dynamischePlanArbeitsentgelt;
        this.planPauschal = planPauschal;
        this.kostenstelle = kostenstelle;
        this.kundenAuftrag = kundenAuftrag;
        this.kostentraeger = kostentraeger;
        this.status = status;
        this.projektortListe = projektortListe;
        this.vorgangListe = vorgangListe;
        this.projektmitarbeiterListe = projektmitarbeiterListe;
        this.projekttaetigkeitListe = projekttaetigkeitListe;
        this.preistabelleListe = preistabelleListe;
        this.defaultFakt = defaultFakt;
        this.rechenArt = rechenArt;
        this.ueberbuchung = ueberbuchung;
        this.waehrung = waehrung;
        this.projektbundesland = projektbundesland;
        this.projektland = projektland;
        this.projekttagessatzListe = projekttagessatzListe;
        this.kundenansprechpartner = kundenansprechpartner;
        this.voreinstFakturierbarkeit = voreinstFakturierbarkeit;
        this.projektzusatzfelder = projektzusatzfelder;
        this.kategorieListe = kategorieListe;
        this.schlagworteListe = schlagworteListe;
        this.istStunden = istStunden;
        this.istStundenFakt = istStundenFakt;
        this.sprache = sprache;
        this.url = url;
        this.vorgaengeEinzelnAbrechnen = vorgaengeEinzelnAbrechnen;
        this.belegeinstellungen = belegeinstellungen;
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
     * Gets the id value for this ProjektType.
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this ProjektType.
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the projektNr value for this ProjektType.
     *
     * @return projektNr   * Die Nummer des Projekts. Wenn die
     *                 				Nummernkreis in der
     *                 				Projekt-Einstellungen definiert ist und
     *                 				dies beutzt werden soll, dann bitte bei
     *                 				Anlage leer lassen.
     */
    public String getProjektNr() {
        return projektNr;
    }

    /**
     * Sets the projektNr value for this ProjektType.
     *
     * @param projektNr   * Die Nummer des Projekts. Wenn die
     *                 				Nummernkreis in der
     *                 				Projekt-Einstellungen definiert ist und
     *                 				dies beutzt werden soll, dann bitte bei
     *                 				Anlage leer lassen.
     */
    public void setProjektNr(String projektNr) {
        this.projektNr = projektNr;
    }

    /**
     * Gets the kundenNr value for this ProjektType.
     *
     * @return kundenNr   * Die Nummer des Kunden, dem dieses
     *                 				Projekt zugeordnet ist. Pflicht bei der
     *                 				Anlage.
     */
    public String getKundenNr() {
        return kundenNr;
    }

    /**
     * Sets the kundenNr value for this ProjektType.
     *
     * @param kundenNr   * Die Nummer des Kunden, dem dieses
     *                 				Projekt zugeordnet ist. Pflicht bei der
     *                 				Anlage.
     */
    public void setKundenNr(String kundenNr) {
        this.kundenNr = kundenNr;
    }

    /**
     * Gets the bezeichnung value for this ProjektType.
     *
     * @return bezeichnung   * Die Bezeichnung des Projektes. Pflicht
     *                 				beim Anlegen.
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the bezeichnung value for this ProjektType.
     *
     * @param bezeichnung   * Die Bezeichnung des Projektes. Pflicht
     *                 				beim Anlegen.
     */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
     * Gets the abteilung value for this ProjektType.
     *
     * @return abteilung   * Die Abteilung, der das Projekt
     *                 				zugeordnet ist.
     */
    public String getAbteilung() {
        return abteilung;
    }

    /**
     * Sets the abteilung value for this ProjektType.
     *
     * @param abteilung   * Die Abteilung, der das Projekt
     *                 				zugeordnet ist.
     */
    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    /**
     * Gets the startDatum value for this ProjektType.
     *
     * @return startDatum   * Das Start-Datum des Projekts. Format:
     *                 				JJJJ-MM-TT
     */
    public String getStartDatum() {
        return startDatum;
    }

    /**
     * Sets the startDatum value for this ProjektType.
     *
     * @param startDatum   * Das Start-Datum des Projekts. Format:
     *                 				JJJJ-MM-TT
     */
    public void setStartDatum(String startDatum) {
        this.startDatum = startDatum;
    }

    /**
     * Gets the endeDatum value for this ProjektType.
     *
     * @return endeDatum   * Das Ende-Datum des Projekts. Format:
     *                 				JJJJ-MM-TT
     */
    public String getEndeDatum() {
        return endeDatum;
    }

    /**
     * Sets the endeDatum value for this ProjektType.
     *
     * @param endeDatum   * Das Ende-Datum des Projekts. Format:
     *                 				JJJJ-MM-TT
     */
    public void setEndeDatum(String endeDatum) {
        this.endeDatum = endeDatum;
    }

    /**
     * Gets the bemerkung value for this ProjektType.
     *
     * @return bemerkung   * Eine Bemerkung zum Projekt.
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Sets the bemerkung value for this ProjektType.
     *
     * @param bemerkung   * Eine Bemerkung zum Projekt.
     */
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    /**
     * Gets the planKosten value for this ProjektType.
     *
     * @return planKosten   * Die geplanten Kosten des Projekts.
     */
    public Double getPlanKosten() {
        return planKosten;
    }

    /**
     * Sets the planKosten value for this ProjektType.
     *
     * @param planKosten   * Die geplanten Kosten des Projekts.
     */
    public void setPlanKosten(Double planKosten) {
        this.planKosten = planKosten;
    }

    /**
     * Gets the dynamischePlanKosten value for this ProjektType.
     *
     * @return dynamischePlanKosten
     */
    public Double getDynamischePlanKosten() {
        return dynamischePlanKosten;
    }

    /**
     * Sets the dynamischePlanKosten value for this ProjektType.
     *
     * @param dynamischePlanKosten
     */
    public void setDynamischePlanKosten(Double dynamischePlanKosten) {
        this.dynamischePlanKosten = dynamischePlanKosten;
    }

    /**
     * Gets the planStunden value for this ProjektType.
     *
     * @return planStunden   * Die geplanten Stunden des Projekts.
     */
    public Double getPlanStunden() {
        return planStunden;
    }

    /**
     * Sets the planStunden value for this ProjektType.
     *
     * @param planStunden   * Die geplanten Stunden des Projekts.
     */
    public void setPlanStunden(Double planStunden) {
        this.planStunden = planStunden;
    }

    /**
     * Gets the dynamischePlanStunden value for this ProjektType.
     *
     * @return dynamischePlanStunden
     */
    public Double getDynamischePlanStunden() {
        return dynamischePlanStunden;
    }

    /**
     * Sets the dynamischePlanStunden value for this ProjektType.
     *
     * @param dynamischePlanStunden
     */
    public void setDynamischePlanStunden(Double dynamischePlanStunden) {
        this.dynamischePlanStunden = dynamischePlanStunden;
    }

    /**
     * Gets the planArbeitsentgelt value for this ProjektType.
     *
     * @return planArbeitsentgelt   * Plan Arbeitsentgelt.
     */
    public Double getPlanArbeitsentgelt() {
        return planArbeitsentgelt;
    }

    /**
     * Sets the planArbeitsentgelt value for this ProjektType.
     *
     * @param planArbeitsentgelt   * Plan Arbeitsentgelt.
     */
    public void setPlanArbeitsentgelt(Double planArbeitsentgelt) {
        this.planArbeitsentgelt = planArbeitsentgelt;
    }

    /**
     * Gets the dynamischePlanArbeitsentgelt value for this ProjektType.
     *
     * @return dynamischePlanArbeitsentgelt
     */
    public Double getDynamischePlanArbeitsentgelt() {
        return dynamischePlanArbeitsentgelt;
    }

    /**
     * Sets the dynamischePlanArbeitsentgelt value for this ProjektType.
     *
     * @param dynamischePlanArbeitsentgelt
     */
    public void setDynamischePlanArbeitsentgelt(Double dynamischePlanArbeitsentgelt) {
        this.dynamischePlanArbeitsentgelt = dynamischePlanArbeitsentgelt;
    }

    /**
     * Gets the planPauschal value for this ProjektType.
     *
     * @return planPauschal   * Der geplante Pauschalpreis des Projekts.
     */
    public Double getPlanPauschal() {
        return planPauschal;
    }

    /**
     * Sets the planPauschal value for this ProjektType.
     *
     * @param planPauschal   * Der geplante Pauschalpreis des Projekts.
     */
    public void setPlanPauschal(Double planPauschal) {
        this.planPauschal = planPauschal;
    }

    /**
     * Gets the kostenstelle value for this ProjektType.
     *
     * @return kostenstelle   * Die Kostenstelle des Projekts (bei
     *                 				Einsatz des Moduls 'Export für
     *                 				Buchhaltung').
     */
    public String getKostenstelle() {
        return kostenstelle;
    }

    /**
     * Sets the kostenstelle value for this ProjektType.
     *
     * @param kostenstelle   * Die Kostenstelle des Projekts (bei
     *                 				Einsatz des Moduls 'Export für
     *                 				Buchhaltung').
     */
    public void setKostenstelle(String kostenstelle) {
        this.kostenstelle = kostenstelle;
    }

    /**
     * Gets the kundenAuftrag value for this ProjektType.
     *
     * @return kundenAuftrag   * Die Aufragsnummer des Kunden für dieses
     *                 				Projekt.
     */
    public String getKundenAuftrag() {
        return kundenAuftrag;
    }

    /**
     * Sets the kundenAuftrag value for this ProjektType.
     *
     * @param kundenAuftrag   * Die Aufragsnummer des Kunden für dieses
     *                 				Projekt.
     */
    public void setKundenAuftrag(String kundenAuftrag) {
        this.kundenAuftrag = kundenAuftrag;
    }

    /**
     * Gets the kostentraeger value for this ProjektType.
     *
     * @return kostentraeger   * Der Kostenträger des Projekts (bei
     *                 				Einsatz des Moduls 'Export für
     *                 				Buchhaltung').
     */
    public String getKostentraeger() {
        return kostentraeger;
    }

    /**
     * Sets the kostentraeger value for this ProjektType.
     *
     * @param kostentraeger   * Der Kostenträger des Projekts (bei
     *                 				Einsatz des Moduls 'Export für
     *                 				Buchhaltung').
     */
    public void setKostentraeger(String kostentraeger) {
        this.kostentraeger = kostentraeger;
    }

    /**
     * Gets the status value for this ProjektType.
     *
     * @return status   * Der Status des Projekts. Dieses ist die
     *                 				Kurzbezeichnung eines der in den
     *                 				Stammdaten definierten Status.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status value for this ProjektType.
     *
     * @param status   * Der Status des Projekts. Dieses ist die
     *                 				Kurzbezeichnung eines der in den
     *                 				Stammdaten definierten Status.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets the projektortListe value for this ProjektType.
     *
     * @return projektortListe   * Die Liste der Projektorte.
     */
    public ProjektortType[] getProjektortListe() {
        return projektortListe;
    }

    /**
     * Sets the projektortListe value for this ProjektType.
     *
     * @param projektortListe   * Die Liste der Projektorte.
     */
    public void setProjektortListe(ProjektortType[] projektortListe) {
        this.projektortListe = projektortListe;
    }

    /**
     * Gets the vorgangListe value for this ProjektType.
     *
     * @return vorgangListe   * Die Liste der Vorgänge des Projekts.
     */
    public VorgangType[] getVorgangListe() {
        return vorgangListe;
    }

    /**
     * Sets the vorgangListe value for this ProjektType.
     *
     * @param vorgangListe   * Die Liste der Vorgänge des Projekts.
     */
    public void setVorgangListe(VorgangType[] vorgangListe) {
        this.vorgangListe = vorgangListe;
    }

    /**
     * Gets the projektmitarbeiterListe value for this ProjektType.
     *
     * @return projektmitarbeiterListe   * Die Liste der Projektmitarbeiter.
     */
    public ProjektMitarbeiterType[] getProjektmitarbeiterListe() {
        return projektmitarbeiterListe;
    }

    /**
     * Sets the projektmitarbeiterListe value for this ProjektType.
     *
     * @param projektmitarbeiterListe   * Die Liste der Projektmitarbeiter.
     */
    public void setProjektmitarbeiterListe(ProjektMitarbeiterType[] projektmitarbeiterListe) {
        this.projektmitarbeiterListe = projektmitarbeiterListe;
    }

    /**
     * Gets the projekttaetigkeitListe value for this ProjektType.
     *
     * @return projekttaetigkeitListe   * Die Liste der projektspezifischen
     *                 				Tätigkeiten.
     */
    public ProjekttaetigkeitType[] getProjekttaetigkeitListe() {
        return projekttaetigkeitListe;
    }

    /**
     * Sets the projekttaetigkeitListe value for this ProjektType.
     *
     * @param projekttaetigkeitListe   * Die Liste der projektspezifischen
     *                 				Tätigkeiten.
     */
    public void setProjekttaetigkeitListe(ProjekttaetigkeitType[] projekttaetigkeitListe) {
        this.projekttaetigkeitListe = projekttaetigkeitListe;
    }

    /**
     * Gets the preistabelleListe value for this ProjektType.
     *
     * @return preistabelleListe   * Die Liste der Projekt-Preistabellen des
     *                 				Projekts.
     */
    public PreistabelleType[] getPreistabelleListe() {
        return preistabelleListe;
    }

    /**
     * Sets the preistabelleListe value for this ProjektType.
     *
     * @param preistabelleListe   * Die Liste der Projekt-Preistabellen des
     *                 				Projekts.
     */
    public void setPreistabelleListe(PreistabelleType[] preistabelleListe) {
        this.preistabelleListe = preistabelleListe;
    }

    /**
     * Gets the defaultFakt value for this ProjektType.
     *
     * @return defaultFakt   * 1=Fakturierbar änderbar(durchMitarbeiter
     *                 				) 2=Fakturierbar nicht änderbar (durch
     *                 				Mitarbeiter) 3=Nicht fakturierbar
     *                 				änderbar (durch Mitarbeiter) 4=Nicht
     *                 				fakturierbar nciht änderbar (durch
     *                 				Mitarbeiter )
     */
    public Integer getDefaultFakt() {
        return defaultFakt;
    }

    /**
     * Sets the defaultFakt value for this ProjektType.
     *
     * @param defaultFakt   * 1=Fakturierbar änderbar(durchMitarbeiter
     *                 				) 2=Fakturierbar nicht änderbar (durch
     *                 				Mitarbeiter) 3=Nicht fakturierbar
     *                 				änderbar (durch Mitarbeiter) 4=Nicht
     *                 				fakturierbar nciht änderbar (durch
     *                 				Mitarbeiter )
     */
    public void setDefaultFakt(Integer defaultFakt) {
        this.defaultFakt = defaultFakt;
    }

    /**
     * Gets the rechenArt value for this ProjektType.
     *
     * @return rechenArt   * 1=Abrechnung Stundensatz 2=Abrechnung
     *                 				Tagessatz 3=Abrechnung Pauschal
     */
    public Integer getRechenArt() {
        return rechenArt;
    }

    /**
     * Sets the rechenArt value for this ProjektType.
     *
     * @param rechenArt   * 1=Abrechnung Stundensatz 2=Abrechnung
     *                 				Tagessatz 3=Abrechnung Pauschal
     */
    public void setRechenArt(Integer rechenArt) {
        this.rechenArt = rechenArt;
    }

    /**
     * Gets the ueberbuchung value for this ProjektType.
     *
     * @return ueberbuchung   * 0=Überbuchung nicht verhindern.
     *                 				1=Überbuchung verhindern nur für
     *                 				fakturierbare Zeiten. 2=Überbuchung
     *                 				verhindern alle Zeiten. 3=Fakturierbar
     *                 				ohne Reise. 4=Alle ohne Reise.
     */
    public Integer getUeberbuchung() {
        return ueberbuchung;
    }

    /**
     * Sets the ueberbuchung value for this ProjektType.
     *
     * @param ueberbuchung   * 0=Überbuchung nicht verhindern.
     *                 				1=Überbuchung verhindern nur für
     *                 				fakturierbare Zeiten. 2=Überbuchung
     *                 				verhindern alle Zeiten. 3=Fakturierbar
     *                 				ohne Reise. 4=Alle ohne Reise.
     */
    public void setUeberbuchung(Integer ueberbuchung) {
        this.ueberbuchung = ueberbuchung;
    }

    /**
     * Gets the waehrung value for this ProjektType.
     *
     * @return waehrung   * Die Projektwährung.
     */
    public String getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the waehrung value for this ProjektType.
     *
     * @param waehrung   * Die Projektwährung.
     */
    public void setWaehrung(String waehrung) {
        this.waehrung = waehrung;
    }

    /**
     * Gets the projektbundesland value for this ProjektType.
     *
     * @return projektbundesland
     */
    public String getProjektbundesland() {
        return projektbundesland;
    }

    /**
     * Sets the projektbundesland value for this ProjektType.
     *
     * @param projektbundesland
     */
    public void setProjektbundesland(String projektbundesland) {
        this.projektbundesland = projektbundesland;
    }

    /**
     * Gets the projektland value for this ProjektType.
     *
     * @return projektland
     */
    public String getProjektland() {
        return projektland;
    }

    /**
     * Sets the projektland value for this ProjektType.
     *
     * @param projektland
     */
    public void setProjektland(String projektland) {
        this.projektland = projektland;
    }

    /**
     * Gets the projekttagessatzListe value for this ProjektType.
     *
     * @return projekttagessatzListe
     */
    public TagessatzanteilType[] getProjekttagessatzListe() {
        return projekttagessatzListe;
    }

    /**
     * Sets the projekttagessatzListe value for this ProjektType.
     *
     * @param projekttagessatzListe
     */
    public void setProjekttagessatzListe(TagessatzanteilType[] projekttagessatzListe) {
        this.projekttagessatzListe = projekttagessatzListe;
    }

    /**
     * Gets the kundenansprechpartner value for this ProjektType.
     *
     * @return kundenansprechpartner   * Dieser soll der Benutzername von
     *                 				Kundenansprechpartner sein, wenn nicht
     *                 				vorhanden dann bleibt leer
     */
    public AnsprechpartnerType getKundenansprechpartner() {
        return kundenansprechpartner;
    }

    /**
     * Sets the kundenansprechpartner value for this ProjektType.
     *
     * @param kundenansprechpartner   * Dieser soll der Benutzername von
     *                 				Kundenansprechpartner sein, wenn nicht
     *                 				vorhanden dann bleibt leer
     */
    public void setKundenansprechpartner(AnsprechpartnerType kundenansprechpartner) {
        this.kundenansprechpartner = kundenansprechpartner;
    }

    /**
     * Gets the voreinstFakturierbarkeit value for this ProjektType.
     *
     * @return voreinstFakturierbarkeit   * 1=Voreinstellung Fakturierbar, durch den
     *                 				Mitarbeiter änderbar 2=Voreinstellung
     *                 				Fakturierbar, durch den Mitarbeiter
     *                 				nicht änderbar 3=Voreinstellung Nicht
     *                 				Fakturierbar, durch den Mitarbeiter
     *                 				änderbar 4=Voreinstellung Nicht
     *                 				Fakturierbar, durch den Mitarbeiter
     *                 				nicht änderbar
     */
    public Integer getVoreinstFakturierbarkeit() {
        return voreinstFakturierbarkeit;
    }

    /**
     * Sets the voreinstFakturierbarkeit value for this ProjektType.
     *
     * @param voreinstFakturierbarkeit   * 1=Voreinstellung Fakturierbar, durch den
     *                 				Mitarbeiter änderbar 2=Voreinstellung
     *                 				Fakturierbar, durch den Mitarbeiter
     *                 				nicht änderbar 3=Voreinstellung Nicht
     *                 				Fakturierbar, durch den Mitarbeiter
     *                 				änderbar 4=Voreinstellung Nicht
     *                 				Fakturierbar, durch den Mitarbeiter
     *                 				nicht änderbar
     */
    public void setVoreinstFakturierbarkeit(Integer voreinstFakturierbarkeit) {
        this.voreinstFakturierbarkeit = voreinstFakturierbarkeit;
    }

    /**
     * Gets the projektzusatzfelder value for this ProjektType.
     *
     * @return projektzusatzfelder
     */
    public ZusatzfelderType getProjektzusatzfelder() {
        return projektzusatzfelder;
    }

    /**
     * Sets the projektzusatzfelder value for this ProjektType.
     *
     * @param projektzusatzfelder
     */
    public void setProjektzusatzfelder(ZusatzfelderType projektzusatzfelder) {
        this.projektzusatzfelder = projektzusatzfelder;
    }

    /**
     * Gets the kategorieListe value for this ProjektType.
     *
     * @return kategorieListe
     */
    public KategorieListeType getKategorieListe() {
        return kategorieListe;
    }

    /**
     * Sets the kategorieListe value for this ProjektType.
     *
     * @param kategorieListe
     */
    public void setKategorieListe(KategorieListeType kategorieListe) {
        this.kategorieListe = kategorieListe;
    }

    /**
     * Gets the schlagworteListe value for this ProjektType.
     *
     * @return schlagworteListe
     */
    public SchlagwortType[] getSchlagworteListe() {
        return schlagworteListe;
    }

    /**
     * Sets the schlagworteListe value for this ProjektType.
     *
     * @param schlagworteListe
     */
    public void setSchlagworteListe(SchlagwortType[] schlagworteListe) {
        this.schlagworteListe = schlagworteListe;
    }

    /**
     * Gets the istStunden value for this ProjektType.
     *
     * @return istStunden
     */
    public Float getIstStunden() {
        return istStunden;
    }

    /**
     * Sets the istStunden value for this ProjektType.
     *
     * @param istStunden
     */
    public void setIstStunden(Float istStunden) {
        this.istStunden = istStunden;
    }

    /**
     * Gets the istStundenFakt value for this ProjektType.
     *
     * @return istStundenFakt
     */
    public Float getIstStundenFakt() {
        return istStundenFakt;
    }

    /**
     * Sets the istStundenFakt value for this ProjektType.
     *
     * @param istStundenFakt
     */
    public void setIstStundenFakt(Float istStundenFakt) {
        this.istStundenFakt = istStundenFakt;
    }

    /**
     * Gets the sprache value for this ProjektType.
     *
     * @return sprache   * Leer = ZEP-Standarsprache de : deutsch
     *                 				en : englisch fr : französisch de_at :
     *                 				deutsch-Österreich de_ch :
     *                 				deutsch-Schweitz en_de : englisch mit
     *                 				deutscher Formatierung en_eu :
     *                 				englisch-Europa en_gb :
     *                 				englisch-Großbritannien en_us :
     *                 				englisch-USA fr_de : französisch mit
     *                 				deutscher Formatierung fr_ch :
     *                 				französisch-Schweitz
     */
    public String getSprache() {
        return sprache;
    }

    /**
     * Sets the sprache value for this ProjektType.
     *
     * @param sprache   * Leer = ZEP-Standarsprache de : deutsch
     *                 				en : englisch fr : französisch de_at :
     *                 				deutsch-Österreich de_ch :
     *                 				deutsch-Schweitz en_de : englisch mit
     *                 				deutscher Formatierung en_eu :
     *                 				englisch-Europa en_gb :
     *                 				englisch-Großbritannien en_us :
     *                 				englisch-USA fr_de : französisch mit
     *                 				deutscher Formatierung fr_ch :
     *                 				französisch-Schweitz
     */
    public void setSprache(String sprache) {
        this.sprache = sprache;
    }

    /**
     * Gets the url value for this ProjektType.
     *
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the url value for this ProjektType.
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Gets the vorgaengeEinzelnAbrechnen value for this ProjektType.
     *
     * @return vorgaengeEinzelnAbrechnen   * Vorgänge werden einzeln abgerechnet
     */
    public Boolean getVorgaengeEinzelnAbrechnen() {
        return vorgaengeEinzelnAbrechnen;
    }

    /**
     * Sets the vorgaengeEinzelnAbrechnen value for this ProjektType.
     *
     * @param vorgaengeEinzelnAbrechnen   * Vorgänge werden einzeln abgerechnet
     */
    public void setVorgaengeEinzelnAbrechnen(Boolean vorgaengeEinzelnAbrechnen) {
        this.vorgaengeEinzelnAbrechnen = vorgaengeEinzelnAbrechnen;
    }

    /**
     * Gets the belegeinstellungen value for this ProjektType.
     *
     * @return belegeinstellungen
     */
    public BelegeinstellungenType getBelegeinstellungen() {
        return belegeinstellungen;
    }

    /**
     * Sets the belegeinstellungen value for this ProjektType.
     *
     * @param belegeinstellungen
     */
    public void setBelegeinstellungen(BelegeinstellungenType belegeinstellungen) {
        this.belegeinstellungen = belegeinstellungen;
    }

    /**
     * Gets the created value for this ProjektType.
     *
     * @return created   * Der Zeitpunkt der Anlage des Objekts.
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the created value for this ProjektType.
     *
     * @param created   * Der Zeitpunkt der Anlage des Objekts.
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * Gets the modified value for this ProjektType.
     *
     * @return modified   * Der Zeitpunkt der letzten Änderung des
     *                 				Objekts.
     */
    public String getModified() {
        return modified;
    }

    /**
     * Sets the modified value for this ProjektType.
     *
     * @param modified   * Der Zeitpunkt der letzten Änderung des
     *                 				Objekts.
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * Gets the attributes value for this ProjektType.
     *
     * @return attributes   * Liste von Attributen für
     *                 				kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this ProjektType.
     *
     * @param attributes   * Liste von Attributen für
     *                 				kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProjektType)) return false;
        ProjektType other = (ProjektType) obj;
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
                ((this.dynamischePlanKosten == null && other.getDynamischePlanKosten() == null) ||
                        (this.dynamischePlanKosten != null &&
                                this.dynamischePlanKosten.equals(other.getDynamischePlanKosten()))) &&
                ((this.planStunden == null && other.getPlanStunden() == null) ||
                        (this.planStunden != null &&
                                this.planStunden.equals(other.getPlanStunden()))) &&
                ((this.dynamischePlanStunden == null && other.getDynamischePlanStunden() == null) ||
                        (this.dynamischePlanStunden != null &&
                                this.dynamischePlanStunden.equals(other.getDynamischePlanStunden()))) &&
                ((this.planArbeitsentgelt == null && other.getPlanArbeitsentgelt() == null) ||
                        (this.planArbeitsentgelt != null &&
                                this.planArbeitsentgelt.equals(other.getPlanArbeitsentgelt()))) &&
                ((this.dynamischePlanArbeitsentgelt == null && other.getDynamischePlanArbeitsentgelt() == null) ||
                        (this.dynamischePlanArbeitsentgelt != null &&
                                this.dynamischePlanArbeitsentgelt.equals(other.getDynamischePlanArbeitsentgelt()))) &&
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
                ((this.projektortListe == null && other.getProjektortListe() == null) ||
                        (this.projektortListe != null &&
                                java.util.Arrays.equals(this.projektortListe, other.getProjektortListe()))) &&
                ((this.vorgangListe == null && other.getVorgangListe() == null) ||
                        (this.vorgangListe != null &&
                                java.util.Arrays.equals(this.vorgangListe, other.getVorgangListe()))) &&
                ((this.projektmitarbeiterListe == null && other.getProjektmitarbeiterListe() == null) ||
                        (this.projektmitarbeiterListe != null &&
                                java.util.Arrays.equals(this.projektmitarbeiterListe, other.getProjektmitarbeiterListe()))) &&
                ((this.projekttaetigkeitListe == null && other.getProjekttaetigkeitListe() == null) ||
                        (this.projekttaetigkeitListe != null &&
                                java.util.Arrays.equals(this.projekttaetigkeitListe, other.getProjekttaetigkeitListe()))) &&
                ((this.preistabelleListe == null && other.getPreistabelleListe() == null) ||
                        (this.preistabelleListe != null &&
                                java.util.Arrays.equals(this.preistabelleListe, other.getPreistabelleListe()))) &&
                ((this.defaultFakt == null && other.getDefaultFakt() == null) ||
                        (this.defaultFakt != null &&
                                this.defaultFakt.equals(other.getDefaultFakt()))) &&
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
                ((this.projekttagessatzListe == null && other.getProjekttagessatzListe() == null) ||
                        (this.projekttagessatzListe != null &&
                                java.util.Arrays.equals(this.projekttagessatzListe, other.getProjekttagessatzListe()))) &&
                ((this.kundenansprechpartner == null && other.getKundenansprechpartner() == null) ||
                        (this.kundenansprechpartner != null &&
                                this.kundenansprechpartner.equals(other.getKundenansprechpartner()))) &&
                ((this.voreinstFakturierbarkeit == null && other.getVoreinstFakturierbarkeit() == null) ||
                        (this.voreinstFakturierbarkeit != null &&
                                this.voreinstFakturierbarkeit.equals(other.getVoreinstFakturierbarkeit()))) &&
                ((this.projektzusatzfelder == null && other.getProjektzusatzfelder() == null) ||
                        (this.projektzusatzfelder != null &&
                                this.projektzusatzfelder.equals(other.getProjektzusatzfelder()))) &&
                ((this.kategorieListe == null && other.getKategorieListe() == null) ||
                        (this.kategorieListe != null &&
                                this.kategorieListe.equals(other.getKategorieListe()))) &&
                ((this.schlagworteListe == null && other.getSchlagworteListe() == null) ||
                        (this.schlagworteListe != null &&
                                java.util.Arrays.equals(this.schlagworteListe, other.getSchlagworteListe()))) &&
                ((this.istStunden == null && other.getIstStunden() == null) ||
                        (this.istStunden != null &&
                                this.istStunden.equals(other.getIstStunden()))) &&
                ((this.istStundenFakt == null && other.getIstStundenFakt() == null) ||
                        (this.istStundenFakt != null &&
                                this.istStundenFakt.equals(other.getIstStundenFakt()))) &&
                ((this.sprache == null && other.getSprache() == null) ||
                        (this.sprache != null &&
                                this.sprache.equals(other.getSprache()))) &&
                ((this.url == null && other.getUrl() == null) ||
                        (this.url != null &&
                                this.url.equals(other.getUrl()))) &&
                ((this.vorgaengeEinzelnAbrechnen == null && other.getVorgaengeEinzelnAbrechnen() == null) ||
                        (this.vorgaengeEinzelnAbrechnen != null &&
                                this.vorgaengeEinzelnAbrechnen.equals(other.getVorgaengeEinzelnAbrechnen()))) &&
                ((this.belegeinstellungen == null && other.getBelegeinstellungen() == null) ||
                        (this.belegeinstellungen != null &&
                                this.belegeinstellungen.equals(other.getBelegeinstellungen()))) &&
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
        if (getDynamischePlanKosten() != null) {
            _hashCode += getDynamischePlanKosten().hashCode();
        }
        if (getPlanStunden() != null) {
            _hashCode += getPlanStunden().hashCode();
        }
        if (getDynamischePlanStunden() != null) {
            _hashCode += getDynamischePlanStunden().hashCode();
        }
        if (getPlanArbeitsentgelt() != null) {
            _hashCode += getPlanArbeitsentgelt().hashCode();
        }
        if (getDynamischePlanArbeitsentgelt() != null) {
            _hashCode += getDynamischePlanArbeitsentgelt().hashCode();
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
        if (getProjektortListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getProjektortListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProjektortListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVorgangListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getVorgangListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getVorgangListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProjektmitarbeiterListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getProjektmitarbeiterListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProjektmitarbeiterListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProjekttaetigkeitListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getProjekttaetigkeitListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProjekttaetigkeitListe(), i);
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
        if (getDefaultFakt() != null) {
            _hashCode += getDefaultFakt().hashCode();
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
        if (getProjekttagessatzListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getProjekttagessatzListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProjekttagessatzListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKundenansprechpartner() != null) {
            _hashCode += getKundenansprechpartner().hashCode();
        }
        if (getVoreinstFakturierbarkeit() != null) {
            _hashCode += getVoreinstFakturierbarkeit().hashCode();
        }
        if (getProjektzusatzfelder() != null) {
            _hashCode += getProjektzusatzfelder().hashCode();
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
        if (getIstStunden() != null) {
            _hashCode += getIstStunden().hashCode();
        }
        if (getIstStundenFakt() != null) {
            _hashCode += getIstStundenFakt().hashCode();
        }
        if (getSprache() != null) {
            _hashCode += getSprache().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getVorgaengeEinzelnAbrechnen() != null) {
            _hashCode += getVorgaengeEinzelnAbrechnen().hashCode();
        }
        if (getBelegeinstellungen() != null) {
            _hashCode += getBelegeinstellungen().hashCode();
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
