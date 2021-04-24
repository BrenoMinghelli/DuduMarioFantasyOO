package Modelos;


import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Extrair {

    private final static String PATH_TO_UNITS = "/sprites/units";

    private Map<String, RedeSprite> units;

    public Extrair() {
        units = new HashMap<>();
        loadSpritesFromDisk();
    }

    private void loadSpritesFromDisk() {
        String[] folderNames = getFolderNames(PATH_TO_UNITS);

        for(String folderName: folderNames) {
            RedeSprite redeSprite = new RedeSprite();
            String pathToFolder = PATH_TO_UNITS + "/" + folderName;
            String[] sheetsInFolder = getSheetsInFolder(pathToFolder);

            for(String sheetName: sheetsInFolder) {
                redeSprite.addSheet(
                        sheetName.substring(0, sheetName.length() - 4),
                        Grafico.loadImage(pathToFolder + "/" + sheetName));
            }

            units.put(folderName, redeSprite);
        }
    }

    private String[] getSheetsInFolder(String basePath) {
        URL resource = Extrair.class.getResource(basePath);
        File file = new File(resource.getFile());
        return file.list((current, name) -> new File(current, name).isFile());
    }

    private String[] getFolderNames(String basePath) {
        URL resource = Extrair.class.getResource("/sprites/units");
        File file = new File(resource.getFile());
        return file.list((current, name) -> new File(current, name).isDirectory());
    }
}
