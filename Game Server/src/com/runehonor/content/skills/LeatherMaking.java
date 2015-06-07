package com.runehonor.content.skills;

import com.runehonor.Constants;
import com.runehonor.event.CycleEvent;
import com.runehonor.event.CycleEventContainer;
import com.runehonor.event.CycleEventHandler;
import com.runehonor.game.items.ItemAssistant;
import com.runehonor.game.players.Client;

public class LeatherMaking extends CraftingData {

	public static void craftLeatherDialogue(final Client c, final int itemUsed, final int usedWith) {
		for (final leatherData l : leatherData.values()) {
			final int leather = (itemUsed == 1733 ? usedWith : itemUsed);
			if (leather == l.getLeather()) {
				if (l.getLeather() == 1741) {
					c.getAssistant().showInterface(2311);
					c.leatherType = leather;
					c.craftDialogue = true;
					return;
				}
				String[] name = {
						"Body", "Chaps", "Bandana", "Boots", "Vamb",
				};
				if (l.getLeather() == 6289) {
					c.getAssistant().sendFrame164(8938);
					c.getAssistant().itemOnInterface(8941, 180, 6322);
					c.getAssistant().itemOnInterface(8942, 180, 6324);
					c.getAssistant().itemOnInterface(8943, 180, 6326);
					c.getAssistant().itemOnInterface(8944, 180, 6328);
					c.getAssistant().itemOnInterface(8945, 180, 6330);
					for (int i = 0; i < name.length; i++) {
						c.getAssistant().sendFrame126(name[i], 8949 + (i * 4));
					}
					c.leatherType = leather;
					c.craftDialogue = true;
					return;
				}
			}
		}
		for (final leatherDialogueData d : leatherDialogueData.values()) {
			final int leather = (itemUsed == 1733 ? usedWith : itemUsed);
			String[] name = {
					"Vamb", "Chaps", "Body",
			};
			if (leather == d.getLeather()) {
				c.getAssistant().sendFrame164(8880);
				c.getAssistant().itemOnInterface(8883, 180, d.getVamb());
				c.getAssistant().itemOnInterface(8884, 180, d.getChaps());
				c.getAssistant().itemOnInterface(8885, 180, d.getBody());
				for (int i = 0; i < name.length; i++) {
					c.getAssistant().sendFrame126(name[i], 8889 + (i * 4));
				}
				c.leatherType = leather;
				c.craftDialogue = true;
				return;
			}
		}
	}

	private static int amount;
	
	public static void craftLeather(final Client c, final int buttonId) {
		if (c.playerIsCrafting == true) {
			return;
		}
		for (final leatherData l : leatherData.values()) {
			if (buttonId == l.getButtonId(buttonId)) {
				if (c.leatherType == l.getLeather()) {
					if (c.playerLevel[12] < l.getLevel()) {
						c.sendMessage("You need a crafting level of "+ l.getLevel() +" to make this.");
						c.getAssistant().removeAllWindows();
						return;
					}
					if (!c.getItems().playerHasItem(1734)) {
						c.sendMessage("You need some thread to make this.");
						c.getAssistant().removeAllWindows();
						return;
					}
					if (!c.getItems().playerHasItem(c.leatherType, l.getHideAmount())) {
						c.getItems();
						c.getItems();
						c.sendMessage("You need "+ l.getHideAmount() +" "+ ItemAssistant.getItemName(c.leatherType).toLowerCase() +" to make "+ ItemAssistant.getItemName(l.getProduct()).toLowerCase()+".");
						c.getAssistant().removeAllWindows();
						return;
					}
					c.startAnimation(1249);
					c.getAssistant().removeAllWindows();
					c.playerIsCrafting = true;
					amount = l.getAmount(buttonId);
					CycleEventHandler.addEvent(3, c, new CycleEvent() {
						@Override
						public void execute(CycleEventContainer container) {
							if (c.playerIsCrafting == true) {
								if (!c.getItems().playerHasItem(1734)) {
									c.sendMessage("You have run out of thread.");
									container.stop();
									return;
								}
								if (!c.getItems().playerHasItem(c.leatherType, l.getHideAmount())) {
									c.sendMessage("You have run out of leather.");
									container.stop();
									return;
								}
								if (amount == 0) {
									container.stop();
									return;
								}
								c.getItems().deleteItem(1734, c.getItems().getItemSlot(1734), 1);
								c.getItems().deleteItem2(c.leatherType, l.getHideAmount());
								c.getItems().addItem(l.getProduct(), 1);
								c.getItems();
								c.getItems();
								c.sendMessage("You make "+ ((ItemAssistant.getItemName(l.getProduct()).contains("body")) ? "a" : "some") +" "+ ItemAssistant.getItemName(l.getProduct()) +".");
								c.getAssistant().addSkillXP((int) l.getXP()*Constants.CRAFTING_EXPERIENCE, 12);
								c.startAnimation(1249);
								amount--;
								if (!c.getItems().playerHasItem(1734)) {
									c.sendMessage("You have run out of thread.");
									container.stop();
									return;
								}
								if (!c.getItems().playerHasItem(c.leatherType, l.getHideAmount())) {
									c.sendMessage("You have run out of leather.");
									container.stop();
									return;
								}
							} else {
								container.stop();
							}
						}
						@Override
						public void stop() {
							c.playerIsCrafting = false;
							c.craftDialogue = false;
						}
					}, 5);
				}
			}
		}
	}
}