package miyabi.vid;

import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;

public class ViewID extends PluginBase implements Listener{

	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
		this.getLogger().info("§a起動しました　§bby miyabi1210");
		this.getServer().getCommandMap().register("plugin",new Vid());
	}
}
