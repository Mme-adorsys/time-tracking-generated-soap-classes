/**
 * StammdatenFeiertagskalenderType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class StammdatenFeiertagskalenderType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(StammdatenFeiertagskalenderType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "StammdatenFeiertagskalenderType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beschreibung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beschreibung"));
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
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("", "region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feiertagListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feiertagListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "FeiertagType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "feiertag"));
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
    }

    private String name;
    private String beschreibung;
    private String land;
    private String region;
    private FeiertagType[] feiertagListe;
    private String created;
    private String modified;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public StammdatenFeiertagskalenderType() {
    }


    public StammdatenFeiertagskalenderType(
            String name,
            String beschreibung,
            String land,
            String region,
            FeiertagType[] feiertagListe,
            String created,
            String modified) {
        this.name = name;
        this.beschreibung = beschreibung;
        this.land = land;
        this.region = region;
        this.feiertagListe = feiertagListe;
        this.created = created;
        this.modified = modified;
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
     * Gets the name value for this StammdatenFeiertagskalenderType.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name value for this StammdatenFeiertagskalenderType.
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the beschreibung value for this StammdatenFeiertagskalenderType.
     *
     * @return beschreibung
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Sets the beschreibung value for this StammdatenFeiertagskalenderType.
     *
     * @param beschreibung
     */
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    /**
     * Gets the land value for this StammdatenFeiertagskalenderType.
     *
     * @return land
     */
    public String getLand() {
        return land;
    }

    /**
     * Sets the land value for this StammdatenFeiertagskalenderType.
     *
     * @param land
     */
    public void setLand(String land) {
        this.land = land;
    }

    /**
     * Gets the region value for this StammdatenFeiertagskalenderType.
     *
     * @return region
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the region value for this StammdatenFeiertagskalenderType.
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Gets the feiertagListe value for this StammdatenFeiertagskalenderType.
     *
     * @return feiertagListe
     */
    public FeiertagType[] getFeiertagListe() {
        return feiertagListe;
    }

    /**
     * Sets the feiertagListe value for this StammdatenFeiertagskalenderType.
     *
     * @param feiertagListe
     */
    public void setFeiertagListe(FeiertagType[] feiertagListe) {
        this.feiertagListe = feiertagListe;
    }

    /**
     * Gets the created value for this StammdatenFeiertagskalenderType.
     *
     * @return created
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the created value for this StammdatenFeiertagskalenderType.
     *
     * @param created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * Gets the modified value for this StammdatenFeiertagskalenderType.
     *
     * @return modified
     */
    public String getModified() {
        return modified;
    }

    /**
     * Sets the modified value for this StammdatenFeiertagskalenderType.
     *
     * @param modified
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof StammdatenFeiertagskalenderType)) return false;
        StammdatenFeiertagskalenderType other = (StammdatenFeiertagskalenderType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.name == null && other.getName() == null) ||
                        (this.name != null &&
                                this.name.equals(other.getName()))) &&
                ((this.beschreibung == null && other.getBeschreibung() == null) ||
                        (this.beschreibung != null &&
                                this.beschreibung.equals(other.getBeschreibung()))) &&
                ((this.land == null && other.getLand() == null) ||
                        (this.land != null &&
                                this.land.equals(other.getLand()))) &&
                ((this.region == null && other.getRegion() == null) ||
                        (this.region != null &&
                                this.region.equals(other.getRegion()))) &&
                ((this.feiertagListe == null && other.getFeiertagListe() == null) ||
                        (this.feiertagListe != null &&
                                java.util.Arrays.equals(this.feiertagListe, other.getFeiertagListe()))) &&
                ((this.created == null && other.getCreated() == null) ||
                        (this.created != null &&
                                this.created.equals(other.getCreated()))) &&
                ((this.modified == null && other.getModified() == null) ||
                        (this.modified != null &&
                                this.modified.equals(other.getModified())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getBeschreibung() != null) {
            _hashCode += getBeschreibung().hashCode();
        }
        if (getLand() != null) {
            _hashCode += getLand().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getFeiertagListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getFeiertagListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getFeiertagListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getModified() != null) {
            _hashCode += getModified().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
