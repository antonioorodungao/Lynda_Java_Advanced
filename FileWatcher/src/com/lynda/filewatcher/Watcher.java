package com.lynda.filewatcher;

import java.io.IOException;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Oro on 6/25/2016.
 */
public class Watcher {

    public static void main(String[] args) {
        try(WatchService service = FileSystems.getDefault().newWatchService()){
            Map<WatchKey, Path> keyMap = new HashMap<>();
            Path path = Paths.get("files");

            keyMap.put(path.register(service,
                    StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_DELETE,
                    StandardWatchEventKinds.ENTRY_MODIFY),path
                    );
            WatchKey watchKey;

            do {
                watchKey = service.take();
                Path eventDir = keyMap.get(watchKey);

                for(WatchEvent<?> event: watchKey.pollEvents()){
                    WatchEvent.Kind kind = event.kind();
                    Path eventPath = (Path)event.context();
                    System.out.println(eventDir + ": " + kind + ": " + eventPath);
                }

            }while (watchKey.reset());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
