package dsm.oscal.model.transform.mappers;

import dsm.oscal.model.OscalMetadata.Location;
import dsm.oscal.model.OscalMetadata.OscalMetadataFactory;
import dsm.oscal.model.transform.MigrationUtils;

public class LocationMapper extends AbstractObjectMapper<Location, gov.nist.secauto.oscal.lib.model.Location> {

	private LocationMapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static LocationMapper instance = new LocationMapper();
	}

	/** Get unique instance of LocationMapper */
	public static LocationMapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected gov.nist.secauto.oscal.lib.model.Location safeToOscal(Location tradesObject) {
		gov.nist.secauto.oscal.lib.model.Location location = new gov.nist.secauto.oscal.lib.model.Location();

		location.setAddress(AddresseMapper.getInstance().toOscal(tradesObject.getAddress()));

		setXMLList(tradesObject.getEmailAddresses(), location::setEmailAddresses);
		buildXMLChildList(LinkMapper.getInstance(), tradesObject.getLinks(), location::setLinks);
		buildXMLChildList(PropertyMapper.getInstance(), tradesObject.getProps(), location::setProps);
		location.setRemarks(tradesObject.getRemarks());

		buildXMLChildList(TelephoneNumberMapper.getInstance(), tradesObject.getTelephoneNumbers(),
				location::setTelephoneNumbers);
		location.setTitle(tradesObject.getTitle());

		setXMLList(tradesObject.getUrls(), location::setUrls);
		location.setUuid(tradesObject.getUuid());
		return location;
	}

	@Override
	protected Location safeToTrades(gov.nist.secauto.oscal.lib.model.Location oscalObject) {
		Location location = OscalMetadataFactory.eINSTANCE.createLocation();

		location.setAddress(AddresseMapper.getInstance().toTrades(oscalObject.getAddress()));

		setList(oscalObject.getEmailAddresses(), location.getEmailAddresses());

		buildChildList(LinkMapper.getInstance(), oscalObject.getLinks(), location::getLinks);
		buildChildList(PropertyMapper.getInstance(), oscalObject.getProps(), location::getProps);
		location.setRemarks(oscalObject.getRemarks());

		buildChildList(TelephoneNumberMapper.getInstance(), oscalObject.getTelephoneNumbers(),
				location::getTelephoneNumbers);
		location.setTitle(oscalObject.getTitle());

		setList(oscalObject.getUrls(), location.getUrls());
		MigrationUtils.setUUID(oscalObject.getUuid(), location);
		return location;
	}

}
