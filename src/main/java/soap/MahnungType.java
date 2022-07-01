/**
 * MahnungType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class MahnungType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(MahnungType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "MahnungType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("rechnungNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechnungNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("ausstehenderBetrag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ausstehenderBetrag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("zahlungsziel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zahlungsziel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
    private String titel;
    private String rechnungNr;
    private String datum;
    private Double betrag;
    private Double ausstehenderBetrag;
    private String zahlungszielDatum;
    private Integer zahlungsziel;
    private String adresse;
    private String created;
    private String modified;
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public MahnungType() {
    }


    public MahnungType(
            Integer id,
            String titel,
            String rechnungNr,
            String datum,
            Double betrag,
            Double ausstehenderBetrag,
            String zahlungszielDatum,
            Integer zahlungsziel,
            String adresse,
            String created,
            String modified,
            AttributeType[] attributes) {
        this.id = id;
        this.titel = titel;
        this.rechnungNr = rechnungNr;
        this.datum = datum;
        this.betrag = betrag;
        this.ausstehenderBetrag = ausstehenderBetrag;
        this.zahlungszielDatum = zahlungszielDatum;
        this.zahlungsziel = zahlungsziel;
        this.adresse = adresse;
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
     * Gets the id value for this MahnungType.
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this MahnungType.
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the titel value for this MahnungType.
     *
     * @return titel
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Sets the titel value for this MahnungType.
     *
     * @param titel
     */
    public void setTitel(String titel) {
        this.titel = titel;
    }

    /**
     * Gets the rechnungNr value for this MahnungType.
     *
     * @return rechnungNr
     */
    public String getRechnungNr() {
        return rechnungNr;
    }

    /**
     * Sets the rechnungNr value for this MahnungType.
     *
     * @param rechnungNr
     */
    public void setRechnungNr(String rechnungNr) {
        this.rechnungNr = rechnungNr;
    }

    /**
     * Gets the datum value for this MahnungType.
     *
     * @return datum
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Sets the datum value for this MahnungType.
     *
     * @param datum
     */
    public void setDatum(String datum) {
        this.datum = datum;
    }

    /**
     * Gets the betrag value for this MahnungType.
     *
     * @return betrag
     */
    public Double getBetrag() {
        return betrag;
    }

    /**
     * Sets the betrag value for this MahnungType.
     *
     * @param betrag
     */
    public void setBetrag(Double betrag) {
        this.betrag = betrag;
    }

    /**
     * Gets the ausstehenderBetrag value for this MahnungType.
     *
     * @return ausstehenderBetrag
     */
    public Double getAusstehenderBetrag() {
        return ausstehenderBetrag;
    }

    /**
     * Sets the ausstehenderBetrag value for this MahnungType.
     *
     * @param ausstehenderBetrag
     */
    public void setAusstehenderBetrag(Double ausstehenderBetrag) {
        this.ausstehenderBetrag = ausstehenderBetrag;
    }

    /**
     * Gets the zahlungszielDatum value for this MahnungType.
     *
     * @return zahlungszielDatum
     */
    public String getZahlungszielDatum() {
        return zahlungszielDatum;
    }

    /**
     * Sets the zahlungszielDatum value for this MahnungType.
     *
     * @param zahlungszielDatum
     */
    public void setZahlungszielDatum(String zahlungszielDatum) {
        this.zahlungszielDatum = zahlungszielDatum;
    }

    /**
     * Gets the zahlungsziel value for this MahnungType.
     *
     * @return zahlungsziel
     */
    public Integer getZahlungsziel() {
        return zahlungsziel;
    }

    /**
     * Sets the zahlungsziel value for this MahnungType.
     *
     * @param zahlungsziel
     */
    public void setZahlungsziel(Integer zahlungsziel) {
        this.zahlungsziel = zahlungsziel;
    }

    /**
     * Gets the adresse value for this MahnungType.
     *
     * @return adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Sets the adresse value for this MahnungType.
     *
     * @param adresse
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * Gets the created value for this MahnungType.
     *
     * @return created
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the created value for this MahnungType.
     *
     * @param created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * Gets the modified value for this MahnungType.
     *
     * @return modified
     */
    public String getModified() {
        return modified;
    }

    /**
     * Sets the modified value for this MahnungType.
     *
     * @param modified
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * Gets the attributes value for this MahnungType.
     *
     * @return attributes
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this MahnungType.
     *
     * @param attributes
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MahnungType)) return false;
        MahnungType other = (MahnungType) obj;
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
                ((this.titel == null && other.getTitel() == null) ||
                        (this.titel != null &&
                                this.titel.equals(other.getTitel()))) &&
                ((this.rechnungNr == null && other.getRechnungNr() == null) ||
                        (this.rechnungNr != null &&
                                this.rechnungNr.equals(other.getRechnungNr()))) &&
                ((this.datum == null && other.getDatum() == null) ||
                        (this.datum != null &&
                                this.datum.equals(other.getDatum()))) &&
                ((this.betrag == null && other.getBetrag() == null) ||
                        (this.betrag != null &&
                                this.betrag.equals(other.getBetrag()))) &&
                ((this.ausstehenderBetrag == null && other.getAusstehenderBetrag() == null) ||
                        (this.ausstehenderBetrag != null &&
                                this.ausstehenderBetrag.equals(other.getAusstehenderBetrag()))) &&
                ((this.zahlungszielDatum == null && other.getZahlungszielDatum() == null) ||
                        (this.zahlungszielDatum != null &&
                                this.zahlungszielDatum.equals(other.getZahlungszielDatum()))) &&
                ((this.zahlungsziel == null && other.getZahlungsziel() == null) ||
                        (this.zahlungsziel != null &&
                                this.zahlungsziel.equals(other.getZahlungsziel()))) &&
                ((this.adresse == null && other.getAdresse() == null) ||
                        (this.adresse != null &&
                                this.adresse.equals(other.getAdresse()))) &&
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
        if (getTitel() != null) {
            _hashCode += getTitel().hashCode();
        }
        if (getRechnungNr() != null) {
            _hashCode += getRechnungNr().hashCode();
        }
        if (getDatum() != null) {
            _hashCode += getDatum().hashCode();
        }
        if (getBetrag() != null) {
            _hashCode += getBetrag().hashCode();
        }
        if (getAusstehenderBetrag() != null) {
            _hashCode += getAusstehenderBetrag().hashCode();
        }
        if (getZahlungszielDatum() != null) {
            _hashCode += getZahlungszielDatum().hashCode();
        }
        if (getZahlungsziel() != null) {
            _hashCode += getZahlungsziel().hashCode();
        }
        if (getAdresse() != null) {
            _hashCode += getAdresse().hashCode();
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
