package miyabi.vid;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.item.Item;


public class Vid extends Command{



		public Vid() {
		super("vid", "itemID表示");
	}



		@Override
		public boolean execute(CommandSender sender, String arg1, String[] arg2) {
			Player player = (Player)sender;
			if(sender.isPlayer()) {
			 Item item = player.getInventory().getItemInHand();
			 int id = item.getId();
			 String iname = item.getName();
		     player.sendMessage("§a>>>§dItem§b[§aID:§d"+id+"§b][§aNAME:§d"+iname+"§b]");
			}
			return false;
		}

}
