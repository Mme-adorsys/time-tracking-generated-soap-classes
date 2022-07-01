/**
 * GeraetType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class GeraetType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GeraetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "GeraetType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "typ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("userIdListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userIdListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "String32"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "userId"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userKategorieListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userKategorieListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "KategorieListeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standortUebermitteln");
        elemField.setXmlName(new javax.xml.namespace.QName("", "standortUebermitteln"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("administratorPinCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "administratorPinCode"));
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
        elemField.setFieldName("erfassungszeitVon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "erfassungszeitVon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("erfassungszeitBis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "erfassungszeitBis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startzeitAnzeigen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startzeitAnzeigen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private int id;
    /* 0 = APP
     * 1 = Terminal */
    private Integer typ;
    private String name;
    private String[] userIdListe;
    private KategorieListeType userKategorieListe;
    private Boolean standortUebermitteln;
    private String administratorPinCode;
    /* Status des Deivces:
     *  0=inaktiv,
     * 1=aktiv,
     * 2=warte auf connect
     * 3=aktiv im Lernmodus
     * 8=Neustart(nur bei Terminal)
     * 9=Neustart Konfiguration (nur bei Terminal) */
    private Integer status;
    private String erfassungszeitVon;
    private String erfassungszeitBis;
    /* Für die Anzeige auf dem Gerät. */
    private Boolean startzeitAnzeigen;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public GeraetType() {
    }


    public GeraetType(
            int id,
            Integer typ,
            String name,
            String[] userIdListe,
            KategorieListeType userKategorieListe,
            Boolean standortUebermitteln,
            String administratorPinCode,
            Integer status,
            String erfassungszeitVon,
            String erfassungszeitBis,
            Boolean startzeitAnzeigen) {
        this.id = id;
        this.typ = typ;
        this.name = name;
        this.userIdListe = userIdListe;
        this.userKategorieListe = userKategorieListe;
        this.standortUebermitteln = standortUebermitteln;
        this.administratorPinCode = administratorPinCode;
        this.status = status;
        this.erfassungszeitVon = erfassungszeitVon;
        this.erfassungszeitBis = erfassungszeitBis;
        this.startzeitAnzeigen = startzeitAnzeigen;
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
     * Gets the id value for this GeraetType.
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id value for this GeraetType.
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the typ value for this GeraetType.
     *
     * @return typ   * 0 = APP
     * 1 = Terminal
     */
    public Integer getTyp() {
        return typ;
    }

    /**
     * Sets the typ value for this GeraetType.
     *
     * @param typ   * 0 = APP
     * 1 = Terminal
     */
    public void setTyp(Integer typ) {
        this.typ = typ;
    }

    /**
     * Gets the name value for this GeraetType.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name value for this GeraetType.
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the userIdListe value for this GeraetType.
     *
     * @return userIdListe
     */
    public String[] getUserIdListe() {
        return userIdListe;
    }

    /**
     * Sets the userIdListe value for this GeraetType.
     *
     * @param userIdListe
     */
    public void setUserIdListe(String[] userIdListe) {
        this.userIdListe = userIdListe;
    }

    /**
     * Gets the userKategorieListe value for this GeraetType.
     *
     * @return userKategorieListe
     */
    public KategorieListeType getUserKategorieListe() {
        return userKategorieListe;
    }

    /**
     * Sets the userKategorieListe value for this GeraetType.
     *
     * @param userKategorieListe
     */
    public void setUserKategorieListe(KategorieListeType userKategorieListe) {
        this.userKategorieListe = userKategorieListe;
    }

    /**
     * Gets the standortUebermitteln value for this GeraetType.
     *
     * @return standortUebermitteln
     */
    public Boolean getStandortUebermitteln() {
        return standortUebermitteln;
    }

    /**
     * Sets the standortUebermitteln value for this GeraetType.
     *
     * @param standortUebermitteln
     */
    public void setStandortUebermitteln(Boolean standortUebermitteln) {
        this.standortUebermitteln = standortUebermitteln;
    }

    /**
     * Gets the administratorPinCode value for this GeraetType.
     *
     * @return administratorPinCode
     */
    public String getAdministratorPinCode() {
        return administratorPinCode;
    }

    /**
     * Sets the administratorPinCode value for this GeraetType.
     *
     * @param administratorPinCode
     */
    public void setAdministratorPinCode(String administratorPinCode) {
        this.administratorPinCode = administratorPinCode;
    }

    /**
     * Gets the status value for this GeraetType.
     *
     * @return status   * Status des Deivces:
     *  0=inaktiv,
     * 1=aktiv,
     * 2=warte auf connect
     * 3=aktiv im Lernmodus
     * 8=Neustart(nur bei Terminal)
     * 9=Neustart Konfiguration (nur bei Terminal)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the status value for this GeraetType.
     *
     * @param status   * Status des Deivces:
     *  0=inaktiv,
     * 1=aktiv,
     * 2=warte auf connect
     * 3=aktiv im Lernmodus
     * 8=Neustart(nur bei Terminal)
     * 9=Neustart Konfiguration (nur bei Terminal)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Gets the erfassungszeitVon value for this GeraetType.
     *
     * @return erfassungszeitVon
     */
    public String getErfassungszeitVon() {
        return erfassungszeitVon;
    }

    /**
     * Sets the erfassungszeitVon value for this GeraetType.
     *
     * @param erfassungszeitVon
     */
    public void setErfassungszeitVon(String erfassungszeitVon) {
        this.erfassungszeitVon = erfassungszeitVon;
    }

    /**
     * Gets the erfassungszeitBis value for this GeraetType.
     *
     * @return erfassungszeitBis
     */
    public String getErfassungszeitBis() {
        return erfassungszeitBis;
    }

    /**
     * Sets the erfassungszeitBis value for this GeraetType.
     *
     * @param erfassungszeitBis
     */
    public void setErfassungszeitBis(String erfassungszeitBis) {
        this.erfassungszeitBis = erfassungszeitBis;
    }

    /**
     * Gets the startzeitAnzeigen value for this GeraetType.
     *
     * @return startzeitAnzeigen   * Für die Anzeige auf dem Gerät.
     */
    public Boolean getStartzeitAnzeigen() {
        return startzeitAnzeigen;
    }

    /**
     * Sets the startzeitAnzeigen value for this GeraetType.
     *
     * @param startzeitAnzeigen   * Für die Anzeige auf dem Gerät.
     */
    public void setStartzeitAnzeigen(Boolean startzeitAnzeigen) {
        this.startzeitAnzeigen = startzeitAnzeigen;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GeraetType)) return false;
        GeraetType other = (GeraetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.id == other.getId() &&
                ((this.typ == null && other.getTyp() == null) ||
                        (this.typ != null &&
                                this.typ.equals(other.getTyp()))) &&
                ((this.name == null && other.getName() == null) ||
                        (this.name != null &&
                                this.name.equals(other.getName()))) &&
                ((this.userIdListe == null && other.getUserIdListe() == null) ||
                        (this.userIdListe != null &&
                                java.util.Arrays.equals(this.userIdListe, other.getUserIdListe()))) &&
                ((this.userKategorieListe == null && other.getUserKategorieListe() == null) ||
                        (this.userKategorieListe != null &&
                                this.userKategorieListe.equals(other.getUserKategorieListe()))) &&
                ((this.standortUebermitteln == null && other.getStandortUebermitteln() == null) ||
                        (this.standortUebermitteln != null &&
                                this.standortUebermitteln.equals(other.getStandortUebermitteln()))) &&
                ((this.administratorPinCode == null && other.getAdministratorPinCode() == null) ||
                        (this.administratorPinCode != null &&
                                this.administratorPinCode.equals(other.getAdministratorPinCode()))) &&
                ((this.status == null && other.getStatus() == null) ||
                        (this.status != null &&
                                this.status.equals(other.getStatus()))) &&
                ((this.erfassungszeitVon == null && other.getErfassungszeitVon() == null) ||
                        (this.erfassungszeitVon != null &&
                                this.erfassungszeitVon.equals(other.getErfassungszeitVon()))) &&
                ((this.erfassungszeitBis == null && other.getErfassungszeitBis() == null) ||
                        (this.erfassungszeitBis != null &&
                                this.erfassungszeitBis.equals(other.getErfassungszeitBis()))) &&
                ((this.startzeitAnzeigen == null && other.getStartzeitAnzeigen() == null) ||
                        (this.startzeitAnzeigen != null &&
                                this.startzeitAnzeigen.equals(other.getStartzeitAnzeigen())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getId();
        if (getTyp() != null) {
            _hashCode += getTyp().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getUserIdListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getUserIdListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getUserIdListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserKategorieListe() != null) {
            _hashCode += getUserKategorieListe().hashCode();
        }
        if (getStandortUebermitteln() != null) {
            _hashCode += getStandortUebermitteln().hashCode();
        }
        if (getAdministratorPinCode() != null) {
            _hashCode += getAdministratorPinCode().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getErfassungszeitVon() != null) {
            _hashCode += getErfassungszeitVon().hashCode();
        }
        if (getErfassungszeitBis() != null) {
            _hashCode += getErfassungszeitBis().hashCode();
        }
        if (getStartzeitAnzeigen() != null) {
            _hashCode += getStartzeitAnzeigen().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
