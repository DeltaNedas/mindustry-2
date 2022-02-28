package mindustry2.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;

public class StatusEffects implements ContentList {
	public static StatusEffect corroded;

	@Override
	public void load() {
		corroded = new StatusEffect("corroded") {{
			color = Color.valueOf("55ff00");
			speedMultiplier = 0.94f;
			effect = Fx.corroded;
			effectChance = 0.08f;
			damage = 0.1f;
		}};
	}
}
