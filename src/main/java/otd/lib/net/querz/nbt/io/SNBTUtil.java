package otd.lib.net.querz.nbt.io;

import java.io.IOException;

import otd.lib.net.querz.nbt.tag.Tag;

public class SNBTUtil {

	public static String toSNBT(Tag<?> tag) throws IOException {
		return new SNBTSerializer().toString(tag);
	}

	public static Tag<?> fromSNBT(String string) throws IOException {
		return new SNBTDeserializer().fromString(string);
	}

	public static Tag<?> fromSNBT(String string, boolean lenient) throws IOException {
		return new SNBTParser(string).parse(Tag.DEFAULT_MAX_DEPTH, lenient);
	}
}
