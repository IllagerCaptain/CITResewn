package shcm.shsupercm.fabric.citresewn.pack.cits;

import net.minecraft.util.Identifier;
import shcm.shsupercm.fabric.citresewn.ex.CITParseException;
import shcm.shsupercm.fabric.citresewn.pack.CITPack;

import java.util.Properties;

public class CITItem extends CIT {
    public CITItem(CITPack pack, Identifier identifier, Properties properties) throws CITParseException {
        super(pack, identifier, properties);
    }
}