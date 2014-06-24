package de.uni_tuebingen.gris.pmb.config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="section")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigurationSection implements IConfigurationSection {

	/**
	 * TODO no doc
	 */
	private static final long serialVersionUID = 2545736528875246781L;
	
	@XmlElementRefs({
		@XmlElementRef(type=ConfigurationPropertyByte.class)
	})
	private final List<IConfigurationPropertyByte> byteProperties;
	
	@XmlElementRefs({
		@XmlElementRef(type=ConfigurationPropertyShort.class)
	})
	private final List<IConfigurationPropertyShort> shortProperties;
	
	@XmlElementRefs({
		@XmlElementRef(type=ConfigurationPropertyInteger.class)
	})
	private final List<IConfigurationPropertyInteger> integerProperties;
	
	@XmlElementRefs({
		@XmlElementRef(type=ConfigurationPropertyLong.class)
	})
	private final List<IConfigurationPropertyLong> longProperties;
	
	@XmlElementRefs({
		@XmlElementRef(type=ConfigurationPropertyFloat.class)
	})
	private final List<IConfigurationPropertyFloat> floatProperties;
	
	@XmlElementRefs({
		@XmlElementRef(type=ConfigurationPropertyDouble.class)
	})
	private final List<IConfigurationPropertyDouble> doubleProperties;
	
	@XmlElementRefs({
		@XmlElementRef(type=ConfigurationPropertyCharacter.class)
	})
	private final List<IConfigurationPropertyCharacter> characterProperties;
	
	@XmlElementRefs({
		@XmlElementRef(type=ConfigurationPropertyString.class)
	})
	private final List<IConfigurationPropertyString> stringProperties;
	
	@XmlElementRefs({
		@XmlElementRef(type=ConfigurationPropertyBoolean.class)
	})
	private final List<IConfigurationPropertyBoolean> booleanProperties;
	
	@XmlElementRefs({
		@XmlElementRef(type=ConfigurationPropertySection.class)
	})
	private final List<IConfigurationPropertySection> sectionProperties; 
	
	@XmlElementRefs({
		@XmlElementRef(type=ConfigurationPropertyByteList.class)
	})
	private final List<IConfigurationPropertyByteList> byteListProperties;
	
	@XmlElementRefs({
		@XmlElementRef(type=ConfigurationPropertyShortList.class)
	})
	private final List<IConfigurationPropertyShortList> shortListProperties;
	
	@XmlElementRefs({
		@XmlElementRef(type=ConfigurationPropertyIntegerList.class)
	})
	private final List<IConfigurationPropertyIntegerList> integerListProperties;
	
	@XmlElementRefs({
		@XmlElementRef(type=ConfigurationPropertyLongList.class)
	})
	private final List<IConfigurationPropertyLongList> longListProperties;
	
	@XmlElementRefs({
		@XmlElementRef(type=ConfigurationPropertyFloatList.class)
	})
	private final List<IConfigurationPropertyFloatList> floatListProperties;
	
	@XmlElementRefs({
		@XmlElementRef(type=ConfigurationPropertyDoubleList.class)
	})
	private final List<IConfigurationPropertyDoubleList> doubleListProperties;
	
	@XmlElementRefs({
		@XmlElementRef(type=ConfigurationPropertyCharacterList.class)
	})
	private final List<IConfigurationPropertyCharacterList> characterListProperties;
	
	@XmlElementRefs({
		@XmlElementRef(type=ConfigurationPropertyStringList.class)
	})
	private final List<IConfigurationPropertyStringList> stringListProperties;
	
	@XmlElementRefs({
		@XmlElementRef(type=ConfigurationPropertyBooleanList.class)
	})
	private final List<IConfigurationPropertyBooleanList> booleanListProperties;
	
	@XmlElementRefs({
		@XmlElementRef(type=ConfigurationPropertySectionList.class)
	})
	private final List<IConfigurationPropertySectionList> sectionListProperties; 
	
	{
		this.byteProperties = new ArrayList<IConfigurationPropertyByte>();
		this.shortProperties = new ArrayList<IConfigurationPropertyShort>();
		this.integerProperties = new ArrayList<IConfigurationPropertyInteger>();
		this.longProperties = new ArrayList<IConfigurationPropertyLong>();
		this.floatProperties = new ArrayList<IConfigurationPropertyFloat>();
		this.doubleProperties = new ArrayList<IConfigurationPropertyDouble>();
		this.characterProperties = new ArrayList<IConfigurationPropertyCharacter>();
		this.stringProperties = new ArrayList<IConfigurationPropertyString>();
		this.booleanProperties = new ArrayList<IConfigurationPropertyBoolean>();
		this.sectionProperties = new ArrayList<IConfigurationPropertySection>();
		this.byteListProperties = new ArrayList<IConfigurationPropertyByteList>();
		this.shortListProperties = new ArrayList<IConfigurationPropertyShortList>();
		this.integerListProperties = new ArrayList<IConfigurationPropertyIntegerList>();
		this.longListProperties = new ArrayList<IConfigurationPropertyLongList>();
		this.floatListProperties = new ArrayList<IConfigurationPropertyFloatList>();
		this.doubleListProperties = new ArrayList<IConfigurationPropertyDoubleList>();
		this.characterListProperties = new ArrayList<IConfigurationPropertyCharacterList>();
		this.stringListProperties = new ArrayList<IConfigurationPropertyStringList>();
		this.booleanListProperties = new ArrayList<IConfigurationPropertyBooleanList>();
		this.sectionListProperties = new ArrayList<IConfigurationPropertySectionList>();
	}

	public ConfigurationSection() {
		super();
	}

	protected ConfigurationSection(IConfigurationSection other) {
		this.getByteProperties().addAll(other.getByteProperties());
		this.getShortProperties().addAll(other.getShortProperties());
		this.getIntegerProperties().addAll(other.getIntegerProperties());
		this.getLongProperties().addAll(other.getLongProperties());
		this.getFloatProperties().addAll(other.getFloatProperties());
		this.getDoubleProperties().addAll(other.getDoubleProperties());
		this.getCharacterProperties().addAll(other.getCharacterProperties());
		this.getStringProperties().addAll(other.getStringProperties());
		this.getBooleanProperties().addAll(other.getBooleanProperties());
		this.getSectionProperties().addAll(other.getSectionProperties());
		this.getByteListProperties().addAll(other.getByteListProperties());
		this.getShortListProperties().addAll(other.getShortListProperties());
		this.getIntegerListProperties().addAll(other.getIntegerListProperties());
		this.getLongListProperties().addAll(other.getLongListProperties());
		this.getFloatListProperties().addAll(other.getFloatListProperties());
		this.getDoubleListProperties().addAll(other.getDoubleListProperties());
		this.getCharacterListProperties().addAll(other.getCharacterListProperties());
		this.getStringListProperties().addAll(other.getStringListProperties());
		this.getBooleanListProperties().addAll(other.getBooleanListProperties());
		this.getSectionListProperties().addAll(other.getSectionListProperties());
	}
	
	/**
	 * TODO no doc
	 */
	@Override
	public ConfigurationSection clone() {
		return new ConfigurationSection(this);
	}

	@Override
	public Byte setByte(String key, Byte value) {
		return set(new ConfigurationPropertyByte(key, value), this.getByteProperties());
	}

	@Override
	public Short setShort(String key, Short value) {
		return set(new ConfigurationPropertyShort(key, value), this.getShortProperties());
	}

	@Override
	public Integer setInteger(String key, Integer value) {
		return set(new ConfigurationPropertyInteger(key, value), this.getIntegerProperties());
	}

	@Override
	public Long setLong(String key, Long value) {
		return set(new ConfigurationPropertyLong(key, value), this.getLongProperties());
	}

	@Override
	public Float setFloat(String key, Float value) {
		return set(new ConfigurationPropertyFloat(key, value), this.getFloatProperties());
	}

	@Override
	public Double setDouble(String key, Double value) {
		return set(new ConfigurationPropertyDouble(key, value), this.getDoubleProperties());
	}

	@Override
	public Character setCharacter(String key, Character value) {
		return set(new ConfigurationPropertyCharacter(key, value), this.getCharacterProperties());
	}

	@Override
	public Boolean setBoolean(String key, Boolean value) {
		return set(new ConfigurationPropertyBoolean(key, value), this.getBooleanProperties());
	}

	@Override
	public String setString(String key, String value) {
		return set(new ConfigurationPropertyString(key, value), this.getStringProperties());
	}

	@Override
	public IConfigurationSection setSection(String key, IConfigurationSection value) {
		return set(new ConfigurationPropertySection(key, value), this.getSectionProperties());
	}

	@Override
	public ArrayList<Byte> setByteList(String key, ArrayList<Byte> value) {
		return set(new ConfigurationPropertyByteList(key, value), this.getByteListProperties());
	}

	@Override
	public ArrayList<Short> setShortList(String key, ArrayList<Short> value) {
		return set(new ConfigurationPropertyShortList(key, value), this.getShortListProperties());
	}

	@Override
	public ArrayList<Integer> setIntegerList(String key, ArrayList<Integer> value) {
		return set(new ConfigurationPropertyIntegerList(key, value), this.getIntegerListProperties());
	}

	@Override
	public ArrayList<Long> setLongList(String key, ArrayList<Long> value) {
		return set(new ConfigurationPropertyLongList(key, value), this.getLongListProperties());
	}

	@Override
	public ArrayList<Float> setFloatList(String key, ArrayList<Float> value) {
		return set(new ConfigurationPropertyFloatList(key, value), this.getFloatListProperties());
	}

	@Override
	public ArrayList<Double> setDoubleList(String key, ArrayList<Double> value) {
		return set(new ConfigurationPropertyDoubleList(key, value), this.getDoubleListProperties());
	}

	@Override
	public ArrayList<Character> setCharacterList(String key, ArrayList<Character> value) {
		return set(new ConfigurationPropertyCharacterList(key, value), this.getCharacterListProperties());
	}

	@Override
	public ArrayList<Boolean> setBooleanList(String key, ArrayList<Boolean> value) {
		return set(new ConfigurationPropertyBooleanList(key, value), this.getBooleanListProperties());
	}

	@Override
	public ArrayList<String> setStringList(String key, ArrayList<String> value) {
		return set(new ConfigurationPropertyStringList(key, value), this.getStringListProperties());
	}

	@Override
	public ArrayList<IConfigurationSection> setSectionList(String key, ArrayList<IConfigurationSection> value) {
		return set(new ConfigurationPropertySectionList(key, value), this.getSectionListProperties());
	}

	@Override
	public Byte getByte(String key) {
		return get(key, this.getByteProperties());
	}

	@Override
	public Short getShort(String key) {
		return get(key, this.getShortProperties());
	}

	@Override
	public Integer getInteger(String key) {
		return get(key, this.getIntegerProperties());
	}

	@Override
	public Long getLong(String key) {
		return get(key, this.getLongProperties());
	}

	@Override
	public Float getFloat(String key) {
		return get(key, this.getFloatProperties());
	}

	@Override
	public Double getDouble(String key) {
		return get(key, this.getDoubleProperties());
	}

	@Override
	public Character getCharacter(String key) {
		return get(key, this.getCharacterProperties());
	}

	@Override
	public String getString(String key) {
		return get(key, this.getStringProperties());
	}

	@Override
	public Boolean getBoolean(String key) {
		return get(key, this.getBooleanProperties());
	}

	@Override
	public IConfigurationSection getSection(String key) {
		return get(key, this.getSectionProperties());
	}

	@Override
	public ArrayList<Byte> getByteList(String key) {
		return get(key, this.getByteListProperties());
	}

	@Override
	public ArrayList<Short> getShortList(String key) {
		return get(key, this.getShortListProperties());
	}

	@Override
	public ArrayList<Integer> getIntegerList(String key) {
		return get(key, this.getIntegerListProperties());
	}

	@Override
	public ArrayList<Long> getLongList(String key) {
		return get(key, this.getLongListProperties());
	}

	@Override
	public ArrayList<Float> getFloatList(String key) {
		return get(key, this.getFloatListProperties());
	}

	@Override
	public ArrayList<Double> getDoubleList(String key) {
		return get(key, this.getDoubleListProperties());
	}

	@Override
	public ArrayList<Character> getCharacterList(String key) {
		return get(key, this.getCharacterListProperties());
	}

	@Override
	public ArrayList<String> getStringList(String key) {
		return get(key, this.getStringListProperties());
	}

	@Override
	public ArrayList<Boolean> getBooleanList(String key) {
		return get(key, this.getBooleanListProperties());
	}

	@Override
	public ArrayList<IConfigurationSection> getSectionList(String key) {
		return get(key, this.getSectionListProperties());
	}

	@Override
	public Byte removeByte(String key) {
		return remove(key, this.getByteProperties());
	}

	@Override
	public Short removeShort(String key) {
		return remove(key, this.getShortProperties());
	}

	@Override
	public Integer removeInteger(String key) {
		return remove(key, this.getIntegerProperties());
	}

	@Override
	public Long removeLong(String key) {
		return remove(key, this.getLongProperties());
	}

	@Override
	public Float removeFloat(String key) {
		return remove(key, this.getFloatProperties());
	}

	@Override
	public Double removeDouble(String key) {
		return remove(key, this.getDoubleProperties());
	}

	@Override
	public Character removeCharacter(String key) {
		return remove(key, this.getCharacterProperties());
	}

	@Override
	public String removeString(String key) {
		return remove(key, this.getStringProperties());
	}

	@Override
	public Boolean removeBoolean(String key) {
		return remove(key, this.getBooleanProperties());
	}

	@Override
	public IConfigurationSection removeSection(String key) {
		return remove(key, this.getSectionProperties());
	}

	@Override
	public ArrayList<Byte> removeByteList(String key) {
		return remove(key, this.getByteListProperties());
	}

	@Override
	public ArrayList<Short> removeShortList(String key) {
		return remove(key, this.getShortListProperties());
	}

	@Override
	public ArrayList<Integer> removeIntegerList(String key) {
		return remove(key, this.getIntegerListProperties());
	}

	@Override
	public ArrayList<Long> removeLongList(String key) {
		return remove(key, this.getLongListProperties());
	}

	@Override
	public ArrayList<Float> removeFloatList(String key) {
		return remove(key, this.getFloatListProperties());
	}

	@Override
	public ArrayList<Double> removeDoubleList(String key) {
		return remove(key, this.getDoubleListProperties());
	}

	@Override
	public ArrayList<Character> removeCharacterList(String key) {
		return remove(key, this.getCharacterListProperties());
	}

	@Override
	public ArrayList<String> removeStringList(String key) {
		return remove(key, this.getStringListProperties());
	}

	@Override
	public ArrayList<Boolean> removeBooleanList(String key) {
		return remove(key, this.getBooleanListProperties());
	}

	@Override
	public ArrayList<IConfigurationSection> removeSectionList(String key) {
		return remove(key, this.getSectionListProperties());
	}

	@Override
	public Collection<String> getByteKeys() {
		return getKeys(this.getByteProperties());
	}

	@Override
	public Collection<String> getShortKeys() {
		return getKeys(this.getShortProperties());
	}

	@Override
	public Collection<String> getIntegerKeys() {
		return getKeys(this.getIntegerProperties());
	}

	@Override
	public Collection<String> getLongKeys() {
		return getKeys(this.getLongProperties());
	}

	@Override
	public Collection<String> getFloatKeys() {
		return getKeys(this.getFloatProperties());
	}

	@Override
	public Collection<String> getDoubleKeys() {
		return getKeys(this.getDoubleProperties());
	}

	@Override
	public Collection<String> getCharacterKeys() {
		return getKeys(this.getCharacterProperties());
	}

	@Override
	public Collection<String> getStringKeys() {
		return getKeys(this.getStringProperties());
	}

	@Override
	public Collection<String> getBooleanKeys() {
		return getKeys(this.getBooleanProperties());
	}

	@Override
	public Collection<String> getSectionKeys() {
		return getKeys(this.getSectionProperties());
	}

	@Override
	public Collection<String> getByteListKeys() {
		return getKeys(this.getByteListProperties());
	}

	@Override
	public Collection<String> getShortListKeys() {
		return getKeys(this.getShortListProperties());
	}

	@Override
	public Collection<String> getIntegerListKeys() {
		return getKeys(this.getIntegerListProperties());
	}

	@Override
	public Collection<String> getLongListKeys() {
		return getKeys(this.getLongListProperties());
	}

	@Override
	public Collection<String> getFloatListKeys() {
		return getKeys(this.getFloatListProperties());
	}

	@Override
	public Collection<String> getDoubleListKeys() {
		return getKeys(this.getDoubleListProperties());
	}

	@Override
	public Collection<String> getCharacterListKeys() {
		return getKeys(this.getCharacterListProperties());
	}

	@Override
	public Collection<String> getStringListKeys() {
		return getKeys(this.getStringListProperties());
	}

	@Override
	public Collection<String> getBooleanListKeys() {
		return getKeys(this.getBooleanListProperties());
	}

	@Override
	public Collection<String> getSectionListKeys() {
		return getKeys(this.getSectionListProperties());
	}

	@Override
	public boolean isByteKey(String key) {
		return isKey(key, this.getByteProperties());
	}

	@Override
	public boolean isShortKey(String key) {
		return isKey(key, this.getShortProperties());
	}

	@Override
	public boolean isIntegerKey(String key) {
		return isKey(key, this.getIntegerProperties());
	}

	@Override
	public boolean isLongKey(String key) {
		return isKey(key, this.getLongProperties());
	}

	@Override
	public boolean isFloatKey(String key) {
		return isKey(key, this.getFloatProperties());
	}

	@Override
	public boolean isDoubleKey(String key) {
		return isKey(key, this.getDoubleProperties());
	}

	@Override
	public boolean isCharacterKey(String key) {
		return isKey(key, this.getCharacterProperties());
	}

	@Override
	public boolean isStringKey(String key) {
		return isKey(key, this.getStringProperties());
	}

	@Override
	public boolean isBooleanKey(String key) {
		return isKey(key, this.getBooleanProperties());
	}

	@Override
	public boolean isSectionKey(String key) {
		return isKey(key, this.getSectionProperties());
	}

	@Override
	public boolean isByteListKey(String key) {
		return isKey(key, this.getByteListProperties());
	}

	@Override
	public boolean isShortListKey(String key) {
		return isKey(key, this.getShortListProperties());
	}

	@Override
	public boolean isIntegerListKey(String key) {
		return isKey(key, this.getIntegerListProperties());
	}

	@Override
	public boolean isLongListKey(String key) {
		return isKey(key, this.getLongListProperties());
	}

	@Override
	public boolean isFloatListKey(String key) {
		return isKey(key, this.getFloatListProperties());
	}

	@Override
	public boolean isDoubleListKey(String key) {
		return isKey(key, this.getDoubleListProperties());
	}

	@Override
	public boolean isCharacterListKey(String key) {
		return isKey(key, this.getCharacterListProperties());
	}

	@Override
	public boolean isStringListKey(String key) {
		return isKey(key, this.getStringListProperties());
	}

	@Override
	public boolean isBooleanListKey(String key) {
		return isKey(key, this.getBooleanListProperties());
	}

	@Override
	public boolean isSectionListKey(String key) {
		return isKey(key, this.getSectionListProperties());
	}

	@Override
	public Collection<IConfigurationPropertyByte> getByteProperties() {
		return this.byteProperties;
	}

	@Override
	public Collection<IConfigurationPropertyShort> getShortProperties() {
		return this.shortProperties;
	}

	@Override
	public Collection<IConfigurationPropertyInteger> getIntegerProperties() {
		return this.integerProperties;
	}

	@Override
	public Collection<IConfigurationPropertyLong> getLongProperties() {
		return this.longProperties;
	}

	@Override
	public Collection<IConfigurationPropertyFloat> getFloatProperties() {
		return this.floatProperties;
	}

	@Override
	public Collection<IConfigurationPropertyDouble> getDoubleProperties() {
		return this.doubleProperties;
	}

	@Override
	public Collection<IConfigurationPropertyCharacter> getCharacterProperties() {
		return this.characterProperties;
	}

	@Override
	public Collection<IConfigurationPropertyString> getStringProperties() {
		return this.stringProperties;
	}

	@Override
	public Collection<IConfigurationPropertyBoolean> getBooleanProperties() {
		return this.booleanProperties;
	}

	@Override
	public Collection<IConfigurationPropertySection> getSectionProperties() {
		return this.sectionProperties;
	}

	@Override
	public Collection<IConfigurationPropertyByteList> getByteListProperties() {
		return this.byteListProperties;
	}

	@Override
	public Collection<IConfigurationPropertyShortList> getShortListProperties() {
		return this.shortListProperties;
	}

	@Override
	public Collection<IConfigurationPropertyIntegerList> getIntegerListProperties() {
		return this.integerListProperties;
	}

	@Override
	public Collection<IConfigurationPropertyLongList> getLongListProperties() {
		return this.longListProperties;
	}

	@Override
	public Collection<IConfigurationPropertyFloatList> getFloatListProperties() {
		return this.floatListProperties;
	}

	@Override
	public Collection<IConfigurationPropertyDoubleList> getDoubleListProperties() {
		return this.doubleListProperties;
	}

	@Override
	public Collection<IConfigurationPropertyCharacterList> getCharacterListProperties() {
		return characterListProperties;
	}

	@Override
	public Collection<IConfigurationPropertyStringList> getStringListProperties() {
		return this.stringListProperties;
	}

	@Override
	public Collection<IConfigurationPropertyBooleanList> getBooleanListProperties() {
		return this.booleanListProperties;
	}

	@Override
	public Collection<IConfigurationPropertySectionList> getSectionListProperties() {
		return this.sectionListProperties;
	}

	private static <T extends Serializable, R extends IConfigurationProperty<T>> T set(R property, Collection<R> list) {
		T old;
		
		if(isKey(property.getKey(),list)) {
			old = get(property.getKey(),list);
			remove(property.getKey(),list);
		} else
			old = null;
		
		list.add(property);

		return old;
	}
	
	private static <T extends Serializable, R extends IConfigurationProperty<T>> boolean isKey(String key, Collection<R> list) {
		for(IConfigurationProperty<T> cp : list)
			if(cp.getKey().equals(key))
				return true;
		return false;
	}
	
	private static <T extends Serializable, R extends IConfigurationProperty<T>> T remove(String key, Collection<R> list) {
		for(IConfigurationProperty<T> cp : list)
			if(cp.getKey().equals(key)) {
				list.remove(cp);
				return cp.getValue();
			}
		return null;
	}
	
	private static <T extends Serializable, R extends IConfigurationProperty<T>> T get(String key, Collection<R> list) {
		for(R cp : list) {
			if(cp.getKey().equals(key))
				return cp.getValue();
		}
		return null;
	}
	
	private static <T extends Serializable, R extends IConfigurationProperty<T>> Collection<String> getKeys(Collection<R> list) {
		Collection<String> keys;
		
		keys = new ArrayList<String>(list.size());
		for(IConfigurationProperty<T> cp : list)
			keys.add(cp.getKey());
		
		return keys;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((booleanProperties == null) ? 0 : booleanProperties
						.hashCode());
		result = prime * result
				+ ((byteProperties == null) ? 0 : byteProperties.hashCode());
		result = prime
				* result
				+ ((characterProperties == null) ? 0 : characterProperties
						.hashCode());
		result = prime
				* result
				+ ((doubleProperties == null) ? 0 : doubleProperties.hashCode());
		result = prime * result
				+ ((floatProperties == null) ? 0 : floatProperties.hashCode());
		result = prime
				* result
				+ ((integerProperties == null) ? 0 : integerProperties
						.hashCode());
		result = prime * result
				+ ((longProperties == null) ? 0 : longProperties.hashCode());
		result = prime
				* result
				+ ((sectionProperties == null) ? 0 : sectionProperties
						.hashCode());
		result = prime * result
				+ ((shortProperties == null) ? 0 : shortProperties.hashCode());
		result = prime
				* result
				+ ((stringProperties == null) ? 0 : stringProperties.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConfigurationSection other = (ConfigurationSection) obj;
		if (booleanProperties == null) {
			if (other.booleanProperties != null)
				return false;
		} else if (!booleanProperties.equals(other.booleanProperties))
			return false;
		if (byteProperties == null) {
			if (other.byteProperties != null)
				return false;
		} else if (!byteProperties.equals(other.byteProperties))
			return false;
		if (characterProperties == null) {
			if (other.characterProperties != null)
				return false;
		} else if (!characterProperties.equals(other.characterProperties))
			return false;
		if (doubleProperties == null) {
			if (other.doubleProperties != null)
				return false;
		} else if (!doubleProperties.equals(other.doubleProperties))
			return false;
		if (floatProperties == null) {
			if (other.floatProperties != null)
				return false;
		} else if (!floatProperties.equals(other.floatProperties))
			return false;
		if (integerProperties == null) {
			if (other.integerProperties != null)
				return false;
		} else if (!integerProperties.equals(other.integerProperties))
			return false;
		if (longProperties == null) {
			if (other.longProperties != null)
				return false;
		} else if (!longProperties.equals(other.longProperties))
			return false;
		if (sectionProperties == null) {
			if (other.sectionProperties != null)
				return false;
		} else if (!sectionProperties.equals(other.sectionProperties))
			return false;
		if (shortProperties == null) {
			if (other.shortProperties != null)
				return false;
		} else if (!shortProperties.equals(other.shortProperties))
			return false;
		if (stringProperties == null) {
			if (other.stringProperties != null)
				return false;
		} else if (!stringProperties.equals(other.stringProperties))
			return false;
		return true;
	}

}
