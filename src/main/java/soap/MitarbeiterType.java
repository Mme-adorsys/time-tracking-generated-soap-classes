/**
 * MitarbeiterType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Daten eines Mitarbeiters.
 */
public class MitarbeiterType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(MitarbeiterType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "MitarbeiterType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nachname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nachname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vorname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vorname"));
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
        elemField.setFieldName("personalNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personalNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strasse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strasse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plz");
        elemField.setXmlName(new javax.xml.namespace.QName("", "plz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("land");
        elemField.setXmlName(new javax.xml.namespace.QName("", "land"));
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
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefonPrivat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telefonPrivat"));
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
        elemField.setFieldName("sprache");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sprache"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anrede");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anrede"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geburtsdatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "geburtsdatum"));
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
        elemField.setFieldName("iban");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iban"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("kontoNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kontoNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blz");
        elemField.setXmlName(new javax.xml.namespace.QName("", "blz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankname"));
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
        elemField.setFieldName("preisgruppe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preisgruppe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beschaeftigungszeitListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beschaeftigungszeitListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "BeschaeftigungszeitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "beschaeftigungszeit"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regelarbeitszeitListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regelarbeitszeitListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RegelarbeitszeitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "regelarbeitszeit"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freigabedatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freigabedatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("internersatzListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internersatzListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "InternersatzType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "internersatz"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waehrung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "waehrung"));
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
        elemField.setFieldName("freelancer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freelancer"));
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
        elemField.setFieldName("kurzzeichen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kurzzeichen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechte");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("abgeglicheneZeitenListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "abgeglicheneZeitenListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AbgeglicheneZeitenType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "abgeglicheneZeiten"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ueberstundenBerechnenUndAnzeigen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ueberstundenBerechnenUndAnzeigen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personioId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personioId"));
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

    /* Der Benutzername. Pflicht bei Anlage,
     *                 				Update und Löschen. */
    private String userId;
    /* Der Nachname des Mitarbeiters. Pflicht
     *                 				bei der Anlage. */
    private String nachname;
    /* Der Vorname des Mitarbeiters. Pflicht
     *                 				bei der Anlage. */
    private String vorname;
    /* Der EMail-Adresse des Mitarbeiters.
     *                 				Pflicht bei der Anlage. */
    private String email;
    /* Die Personalnummer des Mitarbeiters. */
    private String personalNr;
    /* Die Strasse der Adresse des
     *                 				Mitarbeiters. */
    private String strasse;
    /* Die PLZ der Adresse des Mitarbeiters. */
    private String plz;
    /* Der Ort der Adresse des Mitarbeiters. */
    private String ort;
    private String land;
    /* Die Telefonnummer des Mitarbeiters. */
    private String telefon;
    /* Die Faxnummer des Mitarbeiters. */
    private String fax;
    /* Die Mobilnummer des Mitarbeiters. */
    private String mobil;
    /* Die private Telefonnummer des
     *                 				Mitarbeiters. */
    private String telefonPrivat;
    /* Eine Bemerkung zum Mitarbeiter. */
    private String bemerkung;
    /* Die (ZEP-)Sprache des Mitarbeiters. Muss
     *                 				bei Anlage und Updates eine der in ZEP
     *                 				definierten Sprachen sein. Wertebereich:
     *                 				Locale, z.B. de, en, fr. */
    private String sprache;
    /* Die Anrede des Mitarbeiters */
    private String anrede;
    /* Das Geburtsdatum des Mitarbeiter
     *                 				(Format: JJJJ-MM-TT) */
    private String geburtsdatum;
    /* Der dem Mitarbeiter zugeordnete
     *                 				Kostentraeger (bei Einsatz des Moduls
     *                 				Buchhaltungsexport) */
    private String kostentraeger;
    /* Die IBAN des Kontos des Mitarbeiters */
    private String iban;
    /* Die BIC des Kontos des Mitarbeiters */
    private String bic;
    /* Die Kontonummer des Mitarbeiters.
     *                 				Pflicht bei Anlage und Update falls die
     *                 				BLZ gesetzt ist. */
    private String kontoNr;
    /* Die BLZ des Kontos des Mitarbeiters.
     *                 				Pflicht bei Anlage falls die Kontonummer
     *                 				gesetzt ist. */
    private String blz;
    /* Der Name der Bank des Kontos des
     *                 				Mitarbeiters */
    private String bankname;
    /* Die Abteilung, der der Mitarbeiter
     *                 				zugeordnet ist (mit dem
     *                 				Abteilungs-Modul). Muss bei Anlage und
     *                 				Update eine existierende Abteiung sein */
    private String abteilung;
    /* Die Preisgruppe des Mitarbeiters.
     *                 				Pflicht bei der Anlage. */
    private String preisgruppe;
    /* Eine Liste von Beschäftigungszeiträumen. */
    private BeschaeftigungszeitType[] beschaeftigungszeitListe;
    /* Eine Liste von
     *                 				Regelarbeitszeit-Definitionen. */
    private RegelarbeitszeitType[] regelarbeitszeitListe;
    /* Das Datum, bis zu dem der Mitarbeiter
     *                 				seine Zeiten und Belege freigegeben hat. */
    private String freigabedatum;
    /* Der Titel des Mitarbeiters. */
    private String titel;
    /* Liste von internen Stunden-/Tagessätzen. */
    private InternersatzType[] internersatzListe;
    /* Bei Freelancern mit Gutschrift: Währung
     *                 				für Gutschrift. */
    private String waehrung;
    /* Bei Freelancern mit Gutschrift:
     *                 				MwSt-Satz für Gutschrift. */
    private Double mwst;
    /* 0 oder leer=Mitarbeiter, 1=Freelancer,
     *                 				2=Freelancer mit Gutschrift. */
    private Integer freelancer;
    /* Der Zeitpunkt der Anlage des Objekts. */
    private String created;
    /* Der Zeitpunkt der letzten Änderung des
     *                 				Objekts. */
    private String modified;
    /* Das Kurzzeichen des Mitarbeiters. */
    private String kurzzeichen;
    /* Die Rolle des Mitarbeiters. 0 oder
     *                 				leer=User, 1=Admin, 2=Controller, 3=User
     *                 				mit Zusatzrechten. */
    private Integer rechte;
    private KategorieListeType kategorieListe;
    private AbgeglicheneZeitenType[] abgeglicheneZeitenListe;
    private Boolean ueberstundenBerechnenUndAnzeigen;
    /* Die Employee-Id des Benutzers in Personio */
    private String personioId;
    /* Liste von Attributen für
     *                 				kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public MitarbeiterType() {
    }


    public MitarbeiterType(
            String userId,
            String nachname,
            String vorname,
            String email,
            String personalNr,
            String strasse,
            String plz,
            String ort,
            String land,
            String telefon,
            String fax,
            String mobil,
            String telefonPrivat,
            String bemerkung,
            String sprache,
            String anrede,
            String geburtsdatum,
            String kostentraeger,
            String iban,
            String bic,
            String kontoNr,
            String blz,
            String bankname,
            String abteilung,
            String preisgruppe,
            BeschaeftigungszeitType[] beschaeftigungszeitListe,
            RegelarbeitszeitType[] regelarbeitszeitListe,
            String freigabedatum,
            String titel,
            InternersatzType[] internersatzListe,
            String waehrung,
            Double mwst,
            Integer freelancer,
            String created,
            String modified,
            String kurzzeichen,
            Integer rechte,
            KategorieListeType kategorieListe,
            AbgeglicheneZeitenType[] abgeglicheneZeitenListe,
            Boolean ueberstundenBerechnenUndAnzeigen,
            String personioId,
            AttributeType[] attributes) {
        this.userId = userId;
        this.nachname = nachname;
        this.vorname = vorname;
        this.email = email;
        this.personalNr = personalNr;
        this.strasse = strasse;
        this.plz = plz;
        this.ort = ort;
        this.land = land;
        this.telefon = telefon;
        this.fax = fax;
        this.mobil = mobil;
        this.telefonPrivat = telefonPrivat;
        this.bemerkung = bemerkung;
        this.sprache = sprache;
        this.anrede = anrede;
        this.geburtsdatum = geburtsdatum;
        this.kostentraeger = kostentraeger;
        this.iban = iban;
        this.bic = bic;
        this.kontoNr = kontoNr;
        this.blz = blz;
        this.bankname = bankname;
        this.abteilung = abteilung;
        this.preisgruppe = preisgruppe;
        this.beschaeftigungszeitListe = beschaeftigungszeitListe;
        this.regelarbeitszeitListe = regelarbeitszeitListe;
        this.freigabedatum = freigabedatum;
        this.titel = titel;
        this.internersatzListe = internersatzListe;
        this.waehrung = waehrung;
        this.mwst = mwst;
        this.freelancer = freelancer;
        this.created = created;
        this.modified = modified;
        this.kurzzeichen = kurzzeichen;
        this.rechte = rechte;
        this.kategorieListe = kategorieListe;
        this.abgeglicheneZeitenListe = abgeglicheneZeitenListe;
        this.ueberstundenBerechnenUndAnzeigen = ueberstundenBerechnenUndAnzeigen;
        this.personioId = personioId;
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
     * Gets the userId value for this MitarbeiterType.
     *
     * @return userId   * Der Benutzername. Pflicht bei Anlage,
     *                 				Update und Löschen.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId value for this MitarbeiterType.
     *
     * @param userId   * Der Benutzername. Pflicht bei Anlage,
     *                 				Update und Löschen.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the nachname value for this MitarbeiterType.
     *
     * @return nachname   * Der Nachname des Mitarbeiters. Pflicht
     *                 				bei der Anlage.
     */
    public String getNachname() {
        return nachname;
    }

    /**
     * Sets the nachname value for this MitarbeiterType.
     *
     * @param nachname   * Der Nachname des Mitarbeiters. Pflicht
     *                 				bei der Anlage.
     */
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    /**
     * Gets the vorname value for this MitarbeiterType.
     *
     * @return vorname   * Der Vorname des Mitarbeiters. Pflicht
     *                 				bei der Anlage.
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * Sets the vorname value for this MitarbeiterType.
     *
     * @param vorname   * Der Vorname des Mitarbeiters. Pflicht
     *                 				bei der Anlage.
     */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    /**
     * Gets the email value for this MitarbeiterType.
     *
     * @return email   * Der EMail-Adresse des Mitarbeiters.
     *                 				Pflicht bei der Anlage.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email value for this MitarbeiterType.
     *
     * @param email   * Der EMail-Adresse des Mitarbeiters.
     *                 				Pflicht bei der Anlage.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the personalNr value for this MitarbeiterType.
     *
     * @return personalNr   * Die Personalnummer des Mitarbeiters.
     */
    public String getPersonalNr() {
        return personalNr;
    }

    /**
     * Sets the personalNr value for this MitarbeiterType.
     *
     * @param personalNr   * Die Personalnummer des Mitarbeiters.
     */
    public void setPersonalNr(String personalNr) {
        this.personalNr = personalNr;
    }

    /**
     * Gets the strasse value for this MitarbeiterType.
     *
     * @return strasse   * Die Strasse der Adresse des
     *                 				Mitarbeiters.
     */
    public String getStrasse() {
        return strasse;
    }

    /**
     * Sets the strasse value for this MitarbeiterType.
     *
     * @param strasse   * Die Strasse der Adresse des
     *                 				Mitarbeiters.
     */
    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    /**
     * Gets the plz value for this MitarbeiterType.
     *
     * @return plz   * Die PLZ der Adresse des Mitarbeiters.
     */
    public String getPlz() {
        return plz;
    }

    /**
     * Sets the plz value for this MitarbeiterType.
     *
     * @param plz   * Die PLZ der Adresse des Mitarbeiters.
     */
    public void setPlz(String plz) {
        this.plz = plz;
    }

    /**
     * Gets the ort value for this MitarbeiterType.
     *
     * @return ort   * Der Ort der Adresse des Mitarbeiters.
     */
    public String getOrt() {
        return ort;
    }

    /**
     * Sets the ort value for this MitarbeiterType.
     *
     * @param ort   * Der Ort der Adresse des Mitarbeiters.
     */
    public void setOrt(String ort) {
        this.ort = ort;
    }

    /**
     * Gets the land value for this MitarbeiterType.
     *
     * @return land
     */
    public String getLand() {
        return land;
    }

    /**
     * Sets the land value for this MitarbeiterType.
     *
     * @param land
     */
    public void setLand(String land) {
        this.land = land;
    }

    /**
     * Gets the telefon value for this MitarbeiterType.
     *
     * @return telefon   * Die Telefonnummer des Mitarbeiters.
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * Sets the telefon value for this MitarbeiterType.
     *
     * @param telefon   * Die Telefonnummer des Mitarbeiters.
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    /**
     * Gets the fax value for this MitarbeiterType.
     *
     * @return fax   * Die Faxnummer des Mitarbeiters.
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the fax value for this MitarbeiterType.
     *
     * @param fax   * Die Faxnummer des Mitarbeiters.
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * Gets the mobil value for this MitarbeiterType.
     *
     * @return mobil   * Die Mobilnummer des Mitarbeiters.
     */
    public String getMobil() {
        return mobil;
    }

    /**
     * Sets the mobil value for this MitarbeiterType.
     *
     * @param mobil   * Die Mobilnummer des Mitarbeiters.
     */
    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    /**
     * Gets the telefonPrivat value for this MitarbeiterType.
     *
     * @return telefonPrivat   * Die private Telefonnummer des
     *                 				Mitarbeiters.
     */
    public String getTelefonPrivat() {
        return telefonPrivat;
    }

    /**
     * Sets the telefonPrivat value for this MitarbeiterType.
     *
     * @param telefonPrivat   * Die private Telefonnummer des
     *                 				Mitarbeiters.
     */
    public void setTelefonPrivat(String telefonPrivat) {
        this.telefonPrivat = telefonPrivat;
    }

    /**
     * Gets the bemerkung value for this MitarbeiterType.
     *
     * @return bemerkung   * Eine Bemerkung zum Mitarbeiter.
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Sets the bemerkung value for this MitarbeiterType.
     *
     * @param bemerkung   * Eine Bemerkung zum Mitarbeiter.
     */
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    /**
     * Gets the sprache value for this MitarbeiterType.
     *
     * @return sprache   * Die (ZEP-)Sprache des Mitarbeiters. Muss
     *                 				bei Anlage und Updates eine der in ZEP
     *                 				definierten Sprachen sein. Wertebereich:
     *                 				Locale, z.B. de, en, fr.
     */
    public String getSprache() {
        return sprache;
    }

    /**
     * Sets the sprache value for this MitarbeiterType.
     *
     * @param sprache   * Die (ZEP-)Sprache des Mitarbeiters. Muss
     *                 				bei Anlage und Updates eine der in ZEP
     *                 				definierten Sprachen sein. Wertebereich:
     *                 				Locale, z.B. de, en, fr.
     */
    public void setSprache(String sprache) {
        this.sprache = sprache;
    }

    /**
     * Gets the anrede value for this MitarbeiterType.
     *
     * @return anrede   * Die Anrede des Mitarbeiters
     */
    public String getAnrede() {
        return anrede;
    }

    /**
     * Sets the anrede value for this MitarbeiterType.
     *
     * @param anrede   * Die Anrede des Mitarbeiters
     */
    public void setAnrede(String anrede) {
        this.anrede = anrede;
    }

    /**
     * Gets the geburtsdatum value for this MitarbeiterType.
     *
     * @return geburtsdatum   * Das Geburtsdatum des Mitarbeiter
     *                 				(Format: JJJJ-MM-TT)
     */
    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    /**
     * Sets the geburtsdatum value for this MitarbeiterType.
     *
     * @param geburtsdatum   * Das Geburtsdatum des Mitarbeiter
     *                 				(Format: JJJJ-MM-TT)
     */
    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    /**
     * Gets the kostentraeger value for this MitarbeiterType.
     *
     * @return kostentraeger   * Der dem Mitarbeiter zugeordnete
     *                 				Kostentraeger (bei Einsatz des Moduls
     *                 				Buchhaltungsexport)
     */
    public String getKostentraeger() {
        return kostentraeger;
    }

    /**
     * Sets the kostentraeger value for this MitarbeiterType.
     *
     * @param kostentraeger   * Der dem Mitarbeiter zugeordnete
     *                 				Kostentraeger (bei Einsatz des Moduls
     *                 				Buchhaltungsexport)
     */
    public void setKostentraeger(String kostentraeger) {
        this.kostentraeger = kostentraeger;
    }

    /**
     * Gets the iban value for this MitarbeiterType.
     *
     * @return iban   * Die IBAN des Kontos des Mitarbeiters
     */
    public String getIban() {
        return iban;
    }

    /**
     * Sets the iban value for this MitarbeiterType.
     *
     * @param iban   * Die IBAN des Kontos des Mitarbeiters
     */
    public void setIban(String iban) {
        this.iban = iban;
    }

    /**
     * Gets the bic value for this MitarbeiterType.
     *
     * @return bic   * Die BIC des Kontos des Mitarbeiters
     */
    public String getBic() {
        return bic;
    }

    /**
     * Sets the bic value for this MitarbeiterType.
     *
     * @param bic   * Die BIC des Kontos des Mitarbeiters
     */
    public void setBic(String bic) {
        this.bic = bic;
    }

    /**
     * Gets the kontoNr value for this MitarbeiterType.
     *
     * @return kontoNr   * Die Kontonummer des Mitarbeiters.
     *                 				Pflicht bei Anlage und Update falls die
     *                 				BLZ gesetzt ist.
     */
    public String getKontoNr() {
        return kontoNr;
    }

    /**
     * Sets the kontoNr value for this MitarbeiterType.
     *
     * @param kontoNr   * Die Kontonummer des Mitarbeiters.
     *                 				Pflicht bei Anlage und Update falls die
     *                 				BLZ gesetzt ist.
     */
    public void setKontoNr(String kontoNr) {
        this.kontoNr = kontoNr;
    }

    /**
     * Gets the blz value for this MitarbeiterType.
     *
     * @return blz   * Die BLZ des Kontos des Mitarbeiters.
     *                 				Pflicht bei Anlage falls die Kontonummer
     *                 				gesetzt ist.
     */
    public String getBlz() {
        return blz;
    }

    /**
     * Sets the blz value for this MitarbeiterType.
     *
     * @param blz   * Die BLZ des Kontos des Mitarbeiters.
     *                 				Pflicht bei Anlage falls die Kontonummer
     *                 				gesetzt ist.
     */
    public void setBlz(String blz) {
        this.blz = blz;
    }

    /**
     * Gets the bankname value for this MitarbeiterType.
     *
     * @return bankname   * Der Name der Bank des Kontos des
     *                 				Mitarbeiters
     */
    public String getBankname() {
        return bankname;
    }

    /**
     * Sets the bankname value for this MitarbeiterType.
     *
     * @param bankname   * Der Name der Bank des Kontos des
     *                 				Mitarbeiters
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    /**
     * Gets the abteilung value for this MitarbeiterType.
     *
     * @return abteilung   * Die Abteilung, der der Mitarbeiter
     *                 				zugeordnet ist (mit dem
     *                 				Abteilungs-Modul). Muss bei Anlage und
     *                 				Update eine existierende Abteiung sein
     */
    public String getAbteilung() {
        return abteilung;
    }

    /**
     * Sets the abteilung value for this MitarbeiterType.
     *
     * @param abteilung   * Die Abteilung, der der Mitarbeiter
     *                 				zugeordnet ist (mit dem
     *                 				Abteilungs-Modul). Muss bei Anlage und
     *                 				Update eine existierende Abteiung sein
     */
    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    /**
     * Gets the preisgruppe value for this MitarbeiterType.
     *
     * @return preisgruppe   * Die Preisgruppe des Mitarbeiters.
     *                 				Pflicht bei der Anlage.
     */
    public String getPreisgruppe() {
        return preisgruppe;
    }

    /**
     * Sets the preisgruppe value for this MitarbeiterType.
     *
     * @param preisgruppe   * Die Preisgruppe des Mitarbeiters.
     *                 				Pflicht bei der Anlage.
     */
    public void setPreisgruppe(String preisgruppe) {
        this.preisgruppe = preisgruppe;
    }

    /**
     * Gets the beschaeftigungszeitListe value for this MitarbeiterType.
     *
     * @return beschaeftigungszeitListe   * Eine Liste von Beschäftigungszeiträumen.
     */
    public BeschaeftigungszeitType[] getBeschaeftigungszeitListe() {
        return beschaeftigungszeitListe;
    }

    /**
     * Sets the beschaeftigungszeitListe value for this MitarbeiterType.
     *
     * @param beschaeftigungszeitListe   * Eine Liste von Beschäftigungszeiträumen.
     */
    public void setBeschaeftigungszeitListe(BeschaeftigungszeitType[] beschaeftigungszeitListe) {
        this.beschaeftigungszeitListe = beschaeftigungszeitListe;
    }

    /**
     * Gets the regelarbeitszeitListe value for this MitarbeiterType.
     *
     * @return regelarbeitszeitListe   * Eine Liste von
     *                 				Regelarbeitszeit-Definitionen.
     */
    public RegelarbeitszeitType[] getRegelarbeitszeitListe() {
        return regelarbeitszeitListe;
    }

    /**
     * Sets the regelarbeitszeitListe value for this MitarbeiterType.
     *
     * @param regelarbeitszeitListe   * Eine Liste von
     *                 				Regelarbeitszeit-Definitionen.
     */
    public void setRegelarbeitszeitListe(RegelarbeitszeitType[] regelarbeitszeitListe) {
        this.regelarbeitszeitListe = regelarbeitszeitListe;
    }

    /**
     * Gets the freigabedatum value for this MitarbeiterType.
     *
     * @return freigabedatum   * Das Datum, bis zu dem der Mitarbeiter
     *                 				seine Zeiten und Belege freigegeben hat.
     */
    public String getFreigabedatum() {
        return freigabedatum;
    }

    /**
     * Sets the freigabedatum value for this MitarbeiterType.
     *
     * @param freigabedatum   * Das Datum, bis zu dem der Mitarbeiter
     *                 				seine Zeiten und Belege freigegeben hat.
     */
    public void setFreigabedatum(String freigabedatum) {
        this.freigabedatum = freigabedatum;
    }

    /**
     * Gets the titel value for this MitarbeiterType.
     *
     * @return titel   * Der Titel des Mitarbeiters.
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Sets the titel value for this MitarbeiterType.
     *
     * @param titel   * Der Titel des Mitarbeiters.
     */
    public void setTitel(String titel) {
        this.titel = titel;
    }

    /**
     * Gets the internersatzListe value for this MitarbeiterType.
     *
     * @return internersatzListe   * Liste von internen Stunden-/Tagessätzen.
     */
    public InternersatzType[] getInternersatzListe() {
        return internersatzListe;
    }

    /**
     * Sets the internersatzListe value for this MitarbeiterType.
     *
     * @param internersatzListe   * Liste von internen Stunden-/Tagessätzen.
     */
    public void setInternersatzListe(InternersatzType[] internersatzListe) {
        this.internersatzListe = internersatzListe;
    }

    /**
     * Gets the waehrung value for this MitarbeiterType.
     *
     * @return waehrung   * Bei Freelancern mit Gutschrift: Währung
     *                 				für Gutschrift.
     */
    public String getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the waehrung value for this MitarbeiterType.
     *
     * @param waehrung   * Bei Freelancern mit Gutschrift: Währung
     *                 				für Gutschrift.
     */
    public void setWaehrung(String waehrung) {
        this.waehrung = waehrung;
    }

    /**
     * Gets the mwst value for this MitarbeiterType.
     *
     * @return mwst   * Bei Freelancern mit Gutschrift:
     *                 				MwSt-Satz für Gutschrift.
     */
    public Double getMwst() {
        return mwst;
    }

    /**
     * Sets the mwst value for this MitarbeiterType.
     *
     * @param mwst   * Bei Freelancern mit Gutschrift:
     *                 				MwSt-Satz für Gutschrift.
     */
    public void setMwst(Double mwst) {
        this.mwst = mwst;
    }

    /**
     * Gets the freelancer value for this MitarbeiterType.
     *
     * @return freelancer   * 0 oder leer=Mitarbeiter, 1=Freelancer,
     *                 				2=Freelancer mit Gutschrift.
     */
    public Integer getFreelancer() {
        return freelancer;
    }

    /**
     * Sets the freelancer value for this MitarbeiterType.
     *
     * @param freelancer   * 0 oder leer=Mitarbeiter, 1=Freelancer,
     *                 				2=Freelancer mit Gutschrift.
     */
    public void setFreelancer(Integer freelancer) {
        this.freelancer = freelancer;
    }

    /**
     * Gets the created value for this MitarbeiterType.
     *
     * @return created   * Der Zeitpunkt der Anlage des Objekts.
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the created value for this MitarbeiterType.
     *
     * @param created   * Der Zeitpunkt der Anlage des Objekts.
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * Gets the modified value for this MitarbeiterType.
     *
     * @return modified   * Der Zeitpunkt der letzten Änderung des
     *                 				Objekts.
     */
    public String getModified() {
        return modified;
    }

    /**
     * Sets the modified value for this MitarbeiterType.
     *
     * @param modified   * Der Zeitpunkt der letzten Änderung des
     *                 				Objekts.
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * Gets the kurzzeichen value for this MitarbeiterType.
     *
     * @return kurzzeichen   * Das Kurzzeichen des Mitarbeiters.
     */
    public String getKurzzeichen() {
        return kurzzeichen;
    }

    /**
     * Sets the kurzzeichen value for this MitarbeiterType.
     *
     * @param kurzzeichen   * Das Kurzzeichen des Mitarbeiters.
     */
    public void setKurzzeichen(String kurzzeichen) {
        this.kurzzeichen = kurzzeichen;
    }

    /**
     * Gets the rechte value for this MitarbeiterType.
     *
     * @return rechte   * Die Rolle des Mitarbeiters. 0 oder
     *                 				leer=User, 1=Admin, 2=Controller, 3=User
     *                 				mit Zusatzrechten.
     */
    public Integer getRechte() {
        return rechte;
    }

    /**
     * Sets the rechte value for this MitarbeiterType.
     *
     * @param rechte   * Die Rolle des Mitarbeiters. 0 oder
     *                 				leer=User, 1=Admin, 2=Controller, 3=User
     *                 				mit Zusatzrechten.
     */
    public void setRechte(Integer rechte) {
        this.rechte = rechte;
    }

    /**
     * Gets the kategorieListe value for this MitarbeiterType.
     *
     * @return kategorieListe
     */
    public KategorieListeType getKategorieListe() {
        return kategorieListe;
    }

    /**
     * Sets the kategorieListe value for this MitarbeiterType.
     *
     * @param kategorieListe
     */
    public void setKategorieListe(KategorieListeType kategorieListe) {
        this.kategorieListe = kategorieListe;
    }

    /**
     * Gets the abgeglicheneZeitenListe value for this MitarbeiterType.
     *
     * @return abgeglicheneZeitenListe
     */
    public AbgeglicheneZeitenType[] getAbgeglicheneZeitenListe() {
        return abgeglicheneZeitenListe;
    }

    /**
     * Sets the abgeglicheneZeitenListe value for this MitarbeiterType.
     *
     * @param abgeglicheneZeitenListe
     */
    public void setAbgeglicheneZeitenListe(AbgeglicheneZeitenType[] abgeglicheneZeitenListe) {
        this.abgeglicheneZeitenListe = abgeglicheneZeitenListe;
    }

    /**
     * Gets the ueberstundenBerechnenUndAnzeigen value for this MitarbeiterType.
     *
     * @return ueberstundenBerechnenUndAnzeigen
     */
    public Boolean getUeberstundenBerechnenUndAnzeigen() {
        return ueberstundenBerechnenUndAnzeigen;
    }

    /**
     * Sets the ueberstundenBerechnenUndAnzeigen value for this MitarbeiterType.
     *
     * @param ueberstundenBerechnenUndAnzeigen
     */
    public void setUeberstundenBerechnenUndAnzeigen(Boolean ueberstundenBerechnenUndAnzeigen) {
        this.ueberstundenBerechnenUndAnzeigen = ueberstundenBerechnenUndAnzeigen;
    }

    /**
     * Gets the personioId value for this MitarbeiterType.
     *
     * @return personioId   * Die Employee-Id des Benutzers in Personio
     */
    public String getPersonioId() {
        return personioId;
    }

    /**
     * Sets the personioId value for this MitarbeiterType.
     *
     * @param personioId   * Die Employee-Id des Benutzers in Personio
     */
    public void setPersonioId(String personioId) {
        this.personioId = personioId;
    }

    /**
     * Gets the attributes value for this MitarbeiterType.
     *
     * @return attributes   * Liste von Attributen für
     *                 				kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this MitarbeiterType.
     *
     * @param attributes   * Liste von Attributen für
     *                 				kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MitarbeiterType)) return false;
        MitarbeiterType other = (MitarbeiterType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.userId == null && other.getUserId() == null) ||
                        (this.userId != null &&
                                this.userId.equals(other.getUserId()))) &&
                ((this.nachname == null && other.getNachname() == null) ||
                        (this.nachname != null &&
                                this.nachname.equals(other.getNachname()))) &&
                ((this.vorname == null && other.getVorname() == null) ||
                        (this.vorname != null &&
                                this.vorname.equals(other.getVorname()))) &&
                ((this.email == null && other.getEmail() == null) ||
                        (this.email != null &&
                                this.email.equals(other.getEmail()))) &&
                ((this.personalNr == null && other.getPersonalNr() == null) ||
                        (this.personalNr != null &&
                                this.personalNr.equals(other.getPersonalNr()))) &&
                ((this.strasse == null && other.getStrasse() == null) ||
                        (this.strasse != null &&
                                this.strasse.equals(other.getStrasse()))) &&
                ((this.plz == null && other.getPlz() == null) ||
                        (this.plz != null &&
                                this.plz.equals(other.getPlz()))) &&
                ((this.ort == null && other.getOrt() == null) ||
                        (this.ort != null &&
                                this.ort.equals(other.getOrt()))) &&
                ((this.land == null && other.getLand() == null) ||
                        (this.land != null &&
                                this.land.equals(other.getLand()))) &&
                ((this.telefon == null && other.getTelefon() == null) ||
                        (this.telefon != null &&
                                this.telefon.equals(other.getTelefon()))) &&
                ((this.fax == null && other.getFax() == null) ||
                        (this.fax != null &&
                                this.fax.equals(other.getFax()))) &&
                ((this.mobil == null && other.getMobil() == null) ||
                        (this.mobil != null &&
                                this.mobil.equals(other.getMobil()))) &&
                ((this.telefonPrivat == null && other.getTelefonPrivat() == null) ||
                        (this.telefonPrivat != null &&
                                this.telefonPrivat.equals(other.getTelefonPrivat()))) &&
                ((this.bemerkung == null && other.getBemerkung() == null) ||
                        (this.bemerkung != null &&
                                this.bemerkung.equals(other.getBemerkung()))) &&
                ((this.sprache == null && other.getSprache() == null) ||
                        (this.sprache != null &&
                                this.sprache.equals(other.getSprache()))) &&
                ((this.anrede == null && other.getAnrede() == null) ||
                        (this.anrede != null &&
                                this.anrede.equals(other.getAnrede()))) &&
                ((this.geburtsdatum == null && other.getGeburtsdatum() == null) ||
                        (this.geburtsdatum != null &&
                                this.geburtsdatum.equals(other.getGeburtsdatum()))) &&
                ((this.kostentraeger == null && other.getKostentraeger() == null) ||
                        (this.kostentraeger != null &&
                                this.kostentraeger.equals(other.getKostentraeger()))) &&
                ((this.iban == null && other.getIban() == null) ||
                        (this.iban != null &&
                                this.iban.equals(other.getIban()))) &&
                ((this.bic == null && other.getBic() == null) ||
                        (this.bic != null &&
                                this.bic.equals(other.getBic()))) &&
                ((this.kontoNr == null && other.getKontoNr() == null) ||
                        (this.kontoNr != null &&
                                this.kontoNr.equals(other.getKontoNr()))) &&
                ((this.blz == null && other.getBlz() == null) ||
                        (this.blz != null &&
                                this.blz.equals(other.getBlz()))) &&
                ((this.bankname == null && other.getBankname() == null) ||
                        (this.bankname != null &&
                                this.bankname.equals(other.getBankname()))) &&
                ((this.abteilung == null && other.getAbteilung() == null) ||
                        (this.abteilung != null &&
                                this.abteilung.equals(other.getAbteilung()))) &&
                ((this.preisgruppe == null && other.getPreisgruppe() == null) ||
                        (this.preisgruppe != null &&
                                this.preisgruppe.equals(other.getPreisgruppe()))) &&
                ((this.beschaeftigungszeitListe == null && other.getBeschaeftigungszeitListe() == null) ||
                        (this.beschaeftigungszeitListe != null &&
                                java.util.Arrays.equals(this.beschaeftigungszeitListe, other.getBeschaeftigungszeitListe()))) &&
                ((this.regelarbeitszeitListe == null && other.getRegelarbeitszeitListe() == null) ||
                        (this.regelarbeitszeitListe != null &&
                                java.util.Arrays.equals(this.regelarbeitszeitListe, other.getRegelarbeitszeitListe()))) &&
                ((this.freigabedatum == null && other.getFreigabedatum() == null) ||
                        (this.freigabedatum != null &&
                                this.freigabedatum.equals(other.getFreigabedatum()))) &&
                ((this.titel == null && other.getTitel() == null) ||
                        (this.titel != null &&
                                this.titel.equals(other.getTitel()))) &&
                ((this.internersatzListe == null && other.getInternersatzListe() == null) ||
                        (this.internersatzListe != null &&
                                java.util.Arrays.equals(this.internersatzListe, other.getInternersatzListe()))) &&
                ((this.waehrung == null && other.getWaehrung() == null) ||
                        (this.waehrung != null &&
                                this.waehrung.equals(other.getWaehrung()))) &&
                ((this.mwst == null && other.getMwst() == null) ||
                        (this.mwst != null &&
                                this.mwst.equals(other.getMwst()))) &&
                ((this.freelancer == null && other.getFreelancer() == null) ||
                        (this.freelancer != null &&
                                this.freelancer.equals(other.getFreelancer()))) &&
                ((this.created == null && other.getCreated() == null) ||
                        (this.created != null &&
                                this.created.equals(other.getCreated()))) &&
                ((this.modified == null && other.getModified() == null) ||
                        (this.modified != null &&
                                this.modified.equals(other.getModified()))) &&
                ((this.kurzzeichen == null && other.getKurzzeichen() == null) ||
                        (this.kurzzeichen != null &&
                                this.kurzzeichen.equals(other.getKurzzeichen()))) &&
                ((this.rechte == null && other.getRechte() == null) ||
                        (this.rechte != null &&
                                this.rechte.equals(other.getRechte()))) &&
                ((this.kategorieListe == null && other.getKategorieListe() == null) ||
                        (this.kategorieListe != null &&
                                this.kategorieListe.equals(other.getKategorieListe()))) &&
                ((this.abgeglicheneZeitenListe == null && other.getAbgeglicheneZeitenListe() == null) ||
                        (this.abgeglicheneZeitenListe != null &&
                                java.util.Arrays.equals(this.abgeglicheneZeitenListe, other.getAbgeglicheneZeitenListe()))) &&
                ((this.ueberstundenBerechnenUndAnzeigen == null && other.getUeberstundenBerechnenUndAnzeigen() == null) ||
                        (this.ueberstundenBerechnenUndAnzeigen != null &&
                                this.ueberstundenBerechnenUndAnzeigen.equals(other.getUeberstundenBerechnenUndAnzeigen()))) &&
                ((this.personioId == null && other.getPersonioId() == null) ||
                        (this.personioId != null &&
                                this.personioId.equals(other.getPersonioId()))) &&
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getNachname() != null) {
            _hashCode += getNachname().hashCode();
        }
        if (getVorname() != null) {
            _hashCode += getVorname().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getPersonalNr() != null) {
            _hashCode += getPersonalNr().hashCode();
        }
        if (getStrasse() != null) {
            _hashCode += getStrasse().hashCode();
        }
        if (getPlz() != null) {
            _hashCode += getPlz().hashCode();
        }
        if (getOrt() != null) {
            _hashCode += getOrt().hashCode();
        }
        if (getLand() != null) {
            _hashCode += getLand().hashCode();
        }
        if (getTelefon() != null) {
            _hashCode += getTelefon().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getMobil() != null) {
            _hashCode += getMobil().hashCode();
        }
        if (getTelefonPrivat() != null) {
            _hashCode += getTelefonPrivat().hashCode();
        }
        if (getBemerkung() != null) {
            _hashCode += getBemerkung().hashCode();
        }
        if (getSprache() != null) {
            _hashCode += getSprache().hashCode();
        }
        if (getAnrede() != null) {
            _hashCode += getAnrede().hashCode();
        }
        if (getGeburtsdatum() != null) {
            _hashCode += getGeburtsdatum().hashCode();
        }
        if (getKostentraeger() != null) {
            _hashCode += getKostentraeger().hashCode();
        }
        if (getIban() != null) {
            _hashCode += getIban().hashCode();
        }
        if (getBic() != null) {
            _hashCode += getBic().hashCode();
        }
        if (getKontoNr() != null) {
            _hashCode += getKontoNr().hashCode();
        }
        if (getBlz() != null) {
            _hashCode += getBlz().hashCode();
        }
        if (getBankname() != null) {
            _hashCode += getBankname().hashCode();
        }
        if (getAbteilung() != null) {
            _hashCode += getAbteilung().hashCode();
        }
        if (getPreisgruppe() != null) {
            _hashCode += getPreisgruppe().hashCode();
        }
        if (getBeschaeftigungszeitListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getBeschaeftigungszeitListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBeschaeftigungszeitListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRegelarbeitszeitListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getRegelarbeitszeitListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRegelarbeitszeitListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFreigabedatum() != null) {
            _hashCode += getFreigabedatum().hashCode();
        }
        if (getTitel() != null) {
            _hashCode += getTitel().hashCode();
        }
        if (getInternersatzListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getInternersatzListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getInternersatzListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWaehrung() != null) {
            _hashCode += getWaehrung().hashCode();
        }
        if (getMwst() != null) {
            _hashCode += getMwst().hashCode();
        }
        if (getFreelancer() != null) {
            _hashCode += getFreelancer().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getModified() != null) {
            _hashCode += getModified().hashCode();
        }
        if (getKurzzeichen() != null) {
            _hashCode += getKurzzeichen().hashCode();
        }
        if (getRechte() != null) {
            _hashCode += getRechte().hashCode();
        }
        if (getKategorieListe() != null) {
            _hashCode += getKategorieListe().hashCode();
        }
        if (getAbgeglicheneZeitenListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAbgeglicheneZeitenListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAbgeglicheneZeitenListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUeberstundenBerechnenUndAnzeigen() != null) {
            _hashCode += getUeberstundenBerechnenUndAnzeigen().hashCode();
        }
        if (getPersonioId() != null) {
            _hashCode += getPersonioId().hashCode();
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
