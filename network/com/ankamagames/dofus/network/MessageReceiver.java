// Created by Heat the 2017-10-20 01:53:28+02:00
package com.ankamagames.dofus.network;

import org.heat.dofus.network.SimpleNetworkComponentFactory;
import org.heat.dofus.network.NetworkMessage;
import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

public class MessageReceiver extends SimpleNetworkComponentFactory<NetworkMessage> {
  public MessageReceiver() {
    super(createNewRegister());
  }

  public static MessageReceiver createNewReceiver() {
    return new MessageReceiver();
  }

  /** A register filled with default messages. This field is auto-generated via a code generator. */
  public static Map<Integer, Supplier<NetworkMessage>> createNewRegister() {
    Map<Integer, Supplier<NetworkMessage>> res = new HashMap<Integer, Supplier<NetworkMessage>>();

    res.put(
        3003,
        com.ankamagames.dofus.network.messages.game.inventory.items.ObjectUseOnCharacterMessage
            ::new);

    res.put(6585, com.ankamagames.dofus.network.messages.game.idol.IdolListMessage::new);

    res.put(6590, com.ankamagames.dofus.network.messages.game.guild.GuildMotdMessage::new);

    res.put(6441, com.ankamagames.dofus.network.messages.game.prism.PrismsListRegisterMessage::new);

    res.put(
        6243,
        () ->
            com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .DungeonPartyFinderRegisterErrorMessage.i);

    res.put(6680, com.ankamagames.dofus.network.messages.game.dare.DareCancelRequestMessage::new);

    res.put(
        852,
        com.ankamagames.dofus.network.messages.game.chat.ChatClientPrivateWithObjectMessage::new);

    res.put(5853, () -> com.ankamagames.dofus.network.messages.game.prism.PrismInfoCloseMessage.i);

    res.put(
        6351,
        com.ankamagames.dofus.network.messages.web.krosmaster.KrosmasterAuthTokenMessage::new);

    res.put(
        6084,
        com.ankamagames.dofus.network.messages.game.character.choice.CharacterFirstSelectionMessage
            ::new);

    res.put(
        252,
        com.ankamagames.dofus.network.messages.game.context.GameContextRemoveMultipleElementsMessage
            ::new);

    res.put(
        5767,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeStartOkHumanVendorMessage
            ::new);

    res.put(6413, com.ankamagames.dofus.network.messages.game.guild.GuildListMessage::new);

    res.put(
        5762,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeGuildTaxCollectorGetMessage
            ::new);

    res.put(
        5785,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeStartOkNpcTradeMessage
            ::new);

    res.put(
        6484,
        com.ankamagames
                .dofus
                .network
                .messages
                .game
                .context
                .roleplay
                .treasureHunt
                .TreasureHuntDigRequestAnswerMessage
            ::new);

    res.put(
        5774,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeBuyMessage::new);

    res.put(
        6251,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .PartyCancelInvitationNotificationMessage
            ::new);

    res.put(
        5738,
        com.ankamagames.dofus.network.messages.game.context.roleplay.houses.HouseBuyRequestMessage
            ::new);

    res.put(6180, com.ankamagames.dofus.network.messages.game.guild.GuildHouseRemoveMessage::new);

    res.put(
        6500,
        com.ankamagames.dofus.network.messages.game.context.roleplay
                .MapRunningFightDetailsExtendedMessage
            ::new);

    res.put(
        6697,
        com.ankamagames.dofus.network.messages.game.context.mount
                .MountHarnessColorsUpdateRequestMessage
            ::new);

    res.put(
        5697,
        com.ankamagames.dofus.network.messages.game.context.roleplay.houses.HouseSellRequestMessage
            ::new);

    res.put(
        6065,
        com.ankamagames.dofus.network.messages.game.inventory.items.LivingObjectMessageMessage
            ::new);

    res.put(
        6127, com.ankamagames.dofus.network.messages.authorized.ConsoleCommandsListMessage::new);

    res.put(6438, com.ankamagames.dofus.network.messages.game.prism.PrismsListUpdateMessage::new);

    res.put(
        5816,
        () -> com.ankamagames.dofus.network.messages.game.basic.BasicLatencyStatsRequestMessage.i);

    res.put(
        5932, com.ankamagames.dofus.network.messages.game.social.ContactLookRequestMessage::new);

    res.put(6689, com.ankamagames.dofus.network.messages.game.guild.GuildBulletinMessage::new);

    res.put(
        5628,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeLeaveMessage::new);

    res.put(
        6205, com.ankamagames.dofus.network.messages.game.achievement.AchievementListMessage::new);

    res.put(
        6112,
        com.ankamagames.dofus.network.messages.game.interactive.InteractiveUseEndedMessage::new);

    res.put(
        6391,
        com.ankamagames.dofus.network.messages.game.alliance.AllianceCreationResultMessage::new);

    res.put(
        5779,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeRequestOnTaxCollectorMessage
            ::new);

    res.put(
        5910,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeShopStockStartedMessage
            ::new);

    res.put(
        6728,
        com.ankamagames.dofus.network.messages.game.context.roleplay.fight.arena
                .GameRolePlayArenaUpdatePlayerInfosAllQueuesMessage
            ::new);

    res.put(
        6465,
        () ->
            com.ankamagames.dofus.network.messages.game.context.fight
                .GameFightTurnStartPlayingMessage.i);

    res.put(
        6141,
        com.ankamagames.dofus.network.messages.game.context.roleplay.paddock
                .PaddockToSellListRequestMessage
            ::new);

    res.put(
        5513,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeErrorMessage::new);

    res.put(
        6449,
        com.ankamagames.dofus.network.messages.game.alliance
                .AllianceModificationNameAndTagValidMessage
            ::new);

    res.put(
        5653,
        com.ankamagames.dofus.network.messages.game.context.roleplay.job
                .JobCrafterDirectoryRemoveMessage
            ::new);

    res.put(6100, com.ankamagames.dofus.network.messages.queues.QueueStatusMessage::new);

    res.put(
        6066,
        com.ankamagames.dofus.network.messages.game.inventory.items
                .LivingObjectMessageRequestMessage
            ::new);

    res.put(
        6425,
        com.ankamagames.dofus.network.messages.game.context.roleplay.delay
                .GameRolePlayDelayedObjectUseMessage
            ::new);

    res.put(
        6346,
        () ->
            com.ankamagames.dofus.network.messages.web.krosmaster.KrosmasterAuthTokenRequestMessage
                .i);

    res.put(
        150,
        () ->
            com.ankamagames.dofus.network.messages.game.character.choice
                .CharactersListRequestMessage.i);

    res.put(3, com.ankamagames.dofus.network.messages.connection.HelloConnectMessage::new);

    res.put(6012, com.ankamagames.dofus.network.messages.game.dialog.PauseDialogMessage::new);

    res.put(
        5946,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeBidHouseItemRemoveOkMessage
            ::new);

    res.put(
        5740,
        com.ankamagames.dofus.network.messages.game.context.roleplay.lockable
                .LockableShowCodeDialogMessage
            ::new);

    res.put(
        6572,
        () ->
            com.ankamagames.dofus.network.messages.game.interactive.zaap
                .ZaapRespawnSaveRequestMessage.i);

    res.put(
        6454,
        com.ankamagames.dofus.network.messages.game.pvp.UpdateMapPlayersAgressableStatusMessage
            ::new);

    res.put(801, com.ankamagames.dofus.network.messages.game.chat.smiley.ChatSmileyMessage::new);

    res.put(
        5527,
        com.ankamagames.dofus.network.messages.game.actions.fight
                .GameActionFightExchangePositionsMessage
            ::new);

    res.put(
        6076,
        com.ankamagames.dofus.network.messages.game.character.stats
                .CharacterLevelUpInformationMessage
            ::new);

    res.put(
        301,
        com.ankamagames.dofus.network.messages.game.context.roleplay.fight
                .GameRolePlayShowChallengeMessage
            ::new);

    res.put(
        6132,
        com.ankamagames.dofus.network.messages.game.actions.fight.GameActionFightNoSpellCastMessage
            ::new);

    res.put(
        166,
        com.ankamagames.dofus.network.messages.game.character.deletion.CharacterDeletionErrorMessage
            ::new);

    res.put(
        6574,
        com.ankamagames.dofus.network.messages.game.context.roleplay.fight.arena
                .GameRolePlayArenaSwitchToGameServerMessage
            ::new);

    res.put(
        226,
        com.ankamagames.dofus.network.messages.game.context.roleplay
                .MapComplementaryInformationsDataMessage
            ::new);

    res.put(
        5945,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeBidHouseItemAddOkMessage
            ::new);

    res.put(
        22, com.ankamagames.dofus.network.messages.connection.IdentificationSuccessMessage::new);

    res.put(
        6022,
        com.ankamagames.dofus.network.messages.game.context.fight.challenge.ChallengeInfoMessage
            ::new);

    res.put(
        6436,
        com.ankamagames.dofus.network.messages.game.alliance.AllianceVersatileInfoListMessage::new);

    res.put(
        6605,
        com.ankamagames.dofus.network.messages.game.inventory.preset.IdolsPresetDeleteResultMessage
            ::new);

    res.put(
        5630,
        com.ankamagames.dofus.network.messages.game.friend.FriendWarnOnConnectionStateMessage::new);

    res.put(5605, com.ankamagames.dofus.network.messages.game.friend.FriendJoinRequestMessage::new);

    res.put(
        6342,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party.PartyMemberInFightMessage
            ::new);

    res.put(
        6525,
        com.ankamagames.dofus.network.messages.game.basic.CurrentServerStatusUpdateMessage::new);

    res.put(
        6056,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeMountSterilizeFromPaddockMessage
            ::new);

    res.put(
        6592,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .JobBookSubscribeRequestMessage
            ::new);

    res.put(
        6161,
        com.ankamagames.dofus.network.messages.game.context.roleplay.paddock
                .PaddockToSellFilterMessage
            ::new);

    res.put(
        5732,
        com.ankamagames.dofus.network.messages.game.context.roleplay.fight
                .GameRolePlayPlayerFightFriendlyAnswerMessage
            ::new);

    res.put(176, () -> com.ankamagames.dofus.network.messages.game.basic.BasicNoOperationMessage.i);

    res.put(851, com.ankamagames.dofus.network.messages.game.chat.ChatClientPrivateMessage::new);

    res.put(
        6163,
        com.ankamagames.dofus.network.messages.game.inventory.preset.InventoryPresetUseResultMessage
            ::new);

    res.put(
        5517,
        com.ankamagames.dofus.network.messages.game.inventory.items.ExchangeObjectRemovedMessage
            ::new);

    res.put(
        6029,
        com.ankamagames.dofus.network.messages.game.approach.AccountLoggingKickedMessage::new);

    res.put(
        6628,
        () ->
            com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag
                .EditHavenBagFinishedMessage.i);

    res.put(
        6250,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .DungeonPartyFinderRoomContentUpdateMessage
            ::new);

    res.put(
        6021,
        com.ankamagames.dofus.network.messages.game.inventory.items
                .ExchangeMultiCraftSetCrafterCanUseHisRessourcesMessage
            ::new);

    res.put(
        5961,
        com.ankamagames.dofus.network.messages.game.interactive.zaap.TeleportRequestMessage::new);

    res.put(
        6612,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeBidHouseUnsoldItemsMessage
            ::new);

    res.put(
        5884,
        com.ankamagames.dofus.network.messages.game.context.roleplay.houses
                .HouseSellFromInsideRequestMessage
            ::new);

    res.put(
        5583,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .PartyCannotJoinErrorMessage
            ::new);

    res.put(
        6336,
        () ->
            com.ankamagames.dofus.network.messages.game.inventory.ObjectAveragePricesErrorMessage
                .i);

    res.put(
        6119,
        com.ankamagames.dofus.network.messages.connection.IdentificationAccountForceMessage::new);

    res.put(
        6510,
        com.ankamagames
                .dofus
                .network
                .messages
                .game
                .context
                .roleplay
                .treasureHunt
                .TreasureHuntFlagRemoveRequestMessage
            ::new);

    res.put(
        5921,
        com.ankamagames.dofus.network.messages.game.context.fight.GameFightSynchronizeMessage::new);

    res.put(
        6385,
        () ->
            com.ankamagames.dofus.network.messages.game.character.status
                .PlayerStatusUpdateErrorMessage.i);

    res.put(5611, com.ankamagames.dofus.network.messages.game.context.ShowCellRequestMessage::new);

    res.put(
        6363,
        () ->
            com.ankamagames.dofus.network.messages.game.tinsel.TitlesAndOrnamentsListRequestMessage
                .i);

    res.put(
        6047,
        com.ankamagames.dofus.network.messages.game.context.roleplay.job
                .JobCrafterDirectoryListRequestMessage
            ::new);

    res.put(
        6355,
        () -> com.ankamagames.dofus.network.messages.game.friend.SpouseGetInformationsMessage.i);

    res.put(
        6543,
        com.ankamagames.dofus.network.messages.game.context.fight
                .GameFightPlacementSwapPositionsCancelMessage
            ::new);

    res.put(
        5928,
        com.ankamagames.dofus.network.messages.game.guild.tax.GuildFightPlayersEnemiesListMessage
            ::new);

    res.put(
        3025, com.ankamagames.dofus.network.messages.game.inventory.items.ObjectAddedMessage::new);

    res.put(
        5661,
        com.ankamagames.dofus.network.messages.game.context.roleplay.houses
                .HouseKickIndoorMerchantRequestMessage
            ::new);

    res.put(
        6367,
        com.ankamagames.dofus.network.messages.game.tinsel.TitlesAndOrnamentsListMessage::new);

    res.put(
        5741,
        com.ankamagames.dofus.network.messages.game.actions.fight
                .GameActionFightTriggerGlyphTrapMessage
            ::new);

    res.put(5564, com.ankamagames.dofus.network.messages.game.guild.GuildJoinedMessage::new);

    res.put(
        6228,
        com.ankamagames.dofus.network.messages.game.shortcut.ShortcutBarRemoveRequestMessage::new);

    res.put(6414, com.ankamagames.dofus.network.messages.game.alliance.AllianceFactsMessage::new);

    res.put(
        5670,
        com.ankamagames.dofus.network.messages.game.character.stats.CharacterLevelUpMessage::new);

    res.put(
        6456,
        com.ankamagames.dofus.network.messages.game.pvp.UpdateSelfAgressableStatusMessage::new);

    res.put(
        890, com.ankamagames.dofus.network.messages.game.chat.channel.ChannelEnablingMessage::new);

    res.put(
        716,
        com.ankamagames.dofus.network.messages.game.context.fight.GameFightTurnReadyMessage::new);

    res.put(
        6153,
        com.ankamagames.dofus.network.messages.game.context.roleplay.delay
                .GameRolePlayDelayedActionMessage
            ::new);

    res.put(
        6644,
        com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag
                .HavenBagDailyLoteryMessage
            ::new);

    res.put(
        5804,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeBidHouseBuyMessage
            ::new);

    res.put(
        6281,
        com.ankamagames.dofus.network.messages.game.context.roleplay.fight.arena
                .GameRolePlayArenaFighterStatusMessage
            ::new);

    res.put(
        5778,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeSellMessage::new);

    res.put(4001, () -> com.ankamagames.dofus.network.messages.game.friend.FriendsGetListMessage.i);

    res.put(5551, com.ankamagames.dofus.network.messages.game.guild.GuildInvitationMessage::new);

    res.put(
        6631,
        () ->
            com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag
                .ExitHavenBagRequestMessage.i);

    res.put(
        6043,
        com.ankamagames.dofus.network.messages.game.context.roleplay.job
                .JobCrafterDirectoryEntryRequestMessage
            ::new);

    res.put(
        5826,
        com.ankamagames.dofus.network.messages.game.actions.fight
                .GameActionFightDropCharacterMessage
            ::new);

    res.put(
        6197,
        com.ankamagames.dofus.network.messages.game.context.roleplay.ErrorMapNotFoundMessage::new);

    res.put(
        6472,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party.companion
                .PartyCompanionUpdateLightMessage
            ::new);

    res.put(6668, com.ankamagames.dofus.network.messages.game.dare.DareCreatedMessage::new);

    res.put(
        6240,
        () ->
            com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .DungeonPartyFinderAvailableDungeonsRequestMessage.i);

    res.put(
        6018,
        com.ankamagames.dofus.network.messages.game.context.roleplay.paddock
                .PaddockSellBuyDialogMessage
            ::new);

    res.put(
        6316,
        () -> com.ankamagames.dofus.network.messages.game.basic.SequenceNumberRequestMessage.i);

    res.put(
        6687,
        com.ankamagames.dofus.network.messages.game.alliance.AllianceMotdSetRequestMessage::new);

    res.put(175, com.ankamagames.dofus.network.messages.game.basic.BasicTimeMessage::new);

    res.put(
        5505,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeRequestMessage
            ::new);

    res.put(
        5574,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .PartyStopFollowRequestMessage
            ::new);

    res.put(6665, com.ankamagames.dofus.network.messages.game.dare.DareCreationRequestMessage::new);

    res.put(
        5587,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .PartyLocateMembersRequestMessage
            ::new);

    res.put(6453, com.ankamagames.dofus.network.messages.game.prism.PrismFightRemovedMessage::new);

    res.put(4002, com.ankamagames.dofus.network.messages.game.friend.FriendsListMessage::new);

    res.put(
        6632,
        () ->
            com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag
                .EditHavenBagStartMessage.i);

    res.put(
        5720,
        com.ankamagames.dofus.network.messages.game.guild.tax.GuildFightPlayersHelpersJoinMessage
            ::new);

    res.put(
        6269,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .PartyPledgeLoyaltyRequestMessage
            ::new);

    res.put(
        6423, com.ankamagames.dofus.network.messages.game.alliance.AllianceFactsErrorMessage::new);

    res.put(76, com.ankamagames.dofus.network.messages.authorized.AdminCommandMessage::new);

    res.put(
        6645,
        com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag.meeting
                .InviteInHavenBagClosedMessage
            ::new);

    res.put(6317, com.ankamagames.dofus.network.messages.game.basic.SequenceNumberMessage::new);

    res.put(
        5909,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeShopStockMovementUpdatedMessage
            ::new);

    res.put(
        6723,
        com.ankamagames.dofus.network.messages.game.context.roleplay.quest
                .UnfollowQuestObjectiveRequestMessage
            ::new);

    res.put(
        6327,
        com.ankamagames.dofus.network.messages.game.guild.GuildModificationNameValidMessage::new);

    res.put(
        6462,
        com.ankamagames.dofus.network.messages.game.inventory.items.MimicryObjectAssociatedMessage
            ::new);

    res.put(
        5597,
        com.ankamagames.dofus.network.messages.game.guild.GuildInformationsMemberUpdateMessage
            ::new);

    res.put(
        5701,
        com.ankamagames.dofus.network.messages.game.context.roleplay.houses.guild
                .HouseGuildNoneMessage
            ::new);

    res.put(
        5947,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeBidHouseGenericItemAddedMessage
            ::new);

    res.put(
        5908,
        com.ankamagames.dofus.network.messages.game.guild.ChallengeFightJoinRefusedMessage::new);

    res.put(
        5975,
        com.ankamagames.dofus.network.messages.game.context.mount
                .MountInformationInPaddockRequestMessage
            ::new);

    res.put(
        6504,
        com.ankamagames.dofus.network.messages.game.context.fight.GameFightSpectatorJoinMessage
            ::new);

    res.put(
        112,
        () ->
            com.ankamagames.dofus.network.messages.game.approach.AuthenticationTicketRefusedMessage
                .i);

    res.put(5676, () -> com.ankamagames.dofus.network.messages.game.friend.IgnoredGetListMessage.i);

    res.put(
        6636,
        com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag
                .EnterHavenBagRequestMessage
            ::new);

    res.put(
        746,
        () ->
            com.ankamagames.dofus.network.messages.game.context.roleplay.death
                .GameRolePlayGameOverMessage.i);

    res.put(
        6539, com.ankamagames.dofus.network.messages.game.approach.ReloginTokenStatusMessage::new);

    res.put(
        5893, com.ankamagames.dofus.network.messages.game.prism.PrismFightAttackerAddMessage::new);

    res.put(
        1010,
        com.ankamagames.dofus.network.messages.game.actions.fight.GameActionFightSpellCastMessage
            ::new);

    res.put(
        6548,
        () ->
            com.ankamagames.dofus.network.messages.game.context.fight
                .GameFightPlacementSwapPositionsErrorMessage.i);

    res.put(
        165,
        com.ankamagames.dofus.network.messages.game.character.deletion
                .CharacterDeletionRequestMessage
            ::new);

    res.put(
        5635,
        com.ankamagames.dofus.network.messages.game.guild.tax.TaxCollectorAttackedResultMessage
            ::new);

    res.put(
        5584, com.ankamagames.dofus.network.messages.game.atlas.compass.CompassResetMessage::new);

    res.put(5973, com.ankamagames.dofus.network.messages.game.context.mount.MountDataMessage::new);

    res.put(
        6518, com.ankamagames.dofus.network.messages.game.look.AccessoryPreviewRequestMessage::new);

    res.put(
        5689,
        com.ankamagames.dofus.network.messages.game.context.roleplay.emote.EmoteListMessage::new);

    res.put(
        5594,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party.PartyLeaveMessage::new);

    res.put(6658, com.ankamagames.dofus.network.messages.game.dare.DareSubscribedListMessage::new);

    res.put(
        6670,
        com.ankamagames.dofus.network.messages.game.inventory.items.ExchangePodsModifiedMessage
            ::new);

    res.put(
        5745, com.ankamagames.dofus.network.messages.game.interactive.InteractiveUsedMessage::new);

    res.put(
        952,
        () -> com.ankamagames.dofus.network.messages.game.context.GameMapMovementConfirmMessage.i);

    res.put(
        5978,
        com.ankamagames.dofus.network.messages.game.context.mount.MountEmoteIconUsedOkMessage::new);

    res.put(
        6562,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeHandleMountsStableMessage
            ::new);

    res.put(
        6588, com.ankamagames.dofus.network.messages.game.guild.GuildMotdSetRequestMessage::new);

    res.put(
        6396,
        com.ankamagames.dofus.network.messages.game.alliance.AllianceInvitationStateRecruterMessage
            ::new);

    res.put(
        5686,
        com.ankamagames.dofus.network.messages.game.character.stats.LifePointsRegenEndMessage::new);

    res.put(
        6643,
        com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag.meeting
                .InviteInHavenBagOfferMessage
            ::new);

    res.put(
        5700,
        com.ankamagames.dofus.network.messages.game.context.roleplay.houses.guild
                .HouseGuildRightsViewMessage
            ::new);

    res.put(
        6498,
        com.ankamagames
                .dofus
                .network
                .messages
                .game
                .context
                .roleplay
                .treasureHunt
                .TreasureHuntShowLegendaryUIMessage
            ::new);

    res.put(
        6085,
        com.ankamagames.dofus.network.messages.game.context.roleplay.quest
                .QuestObjectiveValidationMessage
            ::new);

    res.put(
        6542,
        com.ankamagames.dofus.network.messages.game.context.fight
                .GameFightPlacementSwapPositionsOfferMessage
            ::new);

    res.put(
        6014,
        com.ankamagames.dofus.network.messages.game.inventory.items.ObjectJobAddedMessage::new);

    res.put(
        5690,
        com.ankamagames.dofus.network.messages.game.context.roleplay.emote.EmotePlayAbstractMessage
            ::new);

    res.put(
        5615,
        com.ankamagames.dofus.network.messages.game.context.roleplay.npc
                .TaxCollectorDialogQuestionExtendedMessage
            ::new);

    res.put(
        5957,
        com.ankamagames.dofus.network.messages.game.guild.GuildPaddockTeleportRequestMessage::new);

    res.put(
        5709,
        com.ankamagames.dofus.network.messages.game.interactive.StatedElementUpdatedMessage::new);

    res.put(
        6260,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party.PartyNewGuestMessage
            ::new);

    res.put(
        6733,
        com.ankamagames.dofus.network.messages.game.character.creation
                .CharacterCanBeCreatedResultMessage
            ::new);

    res.put(
        6448,
        () ->
            com.ankamagames.dofus.network.messages.game.context.roleplay.npc
                .AlliancePrismDialogQuestionMessage.i);

    res.put(
        6241,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .DungeonPartyFinderRegisterSuccessMessage
            ::new);

    res.put(954, com.ankamagames.dofus.network.messages.game.context.GameMapNoMovementMessage::new);

    res.put(6459, com.ankamagames.dofus.network.messages.game.ui.ClientUIOpenedMessage::new);

    res.put(6530, com.ankamagames.dofus.network.messages.common.basic.BasicStatMessage::new);

    res.put(
        5717,
        com.ankamagames.dofus.network.messages.game.guild.tax.GuildFightJoinRequestMessage::new);

    res.put(
        5725,
        com.ankamagames.dofus.network.messages.game.inventory.items
                .LivingObjectChangeSkinRequestMessage
            ::new);

    res.put(
        225,
        com.ankamagames.dofus.network.messages.game.context.roleplay.MapInformationsRequestMessage
            ::new);

    res.put(
        5821,
        com.ankamagames.dofus.network.messages.game.actions.fight.GameActionFightInvisibilityMessage
            ::new);

    res.put(
        6123,
        com.ankamagames.dofus.network.messages.game.context.fight.challenge
                .ChallengeTargetUpdateMessage
            ::new);

    res.put(
        5651,
        com.ankamagames.dofus.network.messages.game.context.roleplay.job
                .JobCrafterDirectoryAddMessage
            ::new);

    res.put(6656, com.ankamagames.dofus.network.messages.game.dare.DareInformationsMessage::new);

    res.put(
        5601, com.ankamagames.dofus.network.messages.game.friend.FriendDeleteResultMessage::new);

    res.put(
        5002,
        com.ankamagames.dofus.network.messages.game.interactive.InteractiveMapUpdateMessage::new);

    res.put(
        5531,
        com.ankamagames.dofus.network.messages.game.actions.fight.GameActionFightReflectSpellMessage
            ::new);

    res.put(
        5001,
        com.ankamagames.dofus.network.messages.game.interactive.InteractiveUseRequestMessage::new);

    res.put(42, com.ankamagames.dofus.network.messages.connection.SelectedServerDataMessage::new);

    res.put(
        6159,
        com.ankamagames.dofus.network.messages.game.friend.GuildMemberSetWarnOnConnectionMessage
            ::new);

    res.put(
        6305,
        com.ankamagames.dofus.network.messages.game.approach.ServerOptionalFeaturesMessage::new);

    res.put(6424, com.ankamagames.dofus.network.messages.game.guild.GuildFactsErrorMessage::new);

    res.put(5662, com.ankamagames.dofus.network.messages.authorized.AdminQuietCommandMessage::new);

    res.put(
        5783,
        () ->
            com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeShowVendorTaxMessage.i);

    res.put(
        6556,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeMountsStableRemoveMessage
            ::new);

    res.put(870, com.ankamagames.dofus.network.messages.game.chat.ChatErrorMessage::new);

    res.put(
        6309,
        com.ankamagames.dofus.network.messages.game.context.fight.character
                .GameFightRefreshFighterMessage
            ::new);

    res.put(
        6315,
        com.ankamagames.dofus.network.messages.game.context.roleplay.houses.AccountHouseMessage
            ::new);

    res.put(
        5576,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party.PartyJoinMessage::new);

    res.put(
        6325,
        () ->
            com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeObjectTransfertExistingFromInvMessage.i);

    res.put(
        1099,
        com.ankamagames.dofus.network.messages.game.actions.fight.GameActionFightDeathMessage::new);

    res.put(
        6417,
        () ->
            com.ankamagames.dofus.network.messages.game.alliance.AllianceInsiderInfoRequestMessage
                .i);

    res.put(
        6735,
        com.ankamagames.dofus.network.messages.game.inventory.AbstractPresetDeleteMessage::new);

    res.put(
        711,
        com.ankamagames.dofus.network.messages.game.context.fight.GameFightRemoveTeamMemberMessage
            ::new);

    res.put(
        5919, com.ankamagames.dofus.network.messages.game.guild.GuildHousesInformationMessage::new);

    res.put(5887, com.ankamagames.dofus.network.messages.game.guild.GuildKickRequestMessage::new);

    res.put(1503, com.ankamagames.dofus.network.messages.updater.parts.DownloadPartMessage::new);

    res.put(
        5535,
        com.ankamagames.dofus.network.messages.game.actions.fight.GameActionFightStealKamaMessage
            ::new);

    res.put(
        5809,
        com.ankamagames.dofus.network.messages.game.context.roleplay.job
                .JobExperienceMultiUpdateMessage
            ::new);

    res.put(
        6403, com.ankamagames.dofus.network.messages.game.alliance.AllianceInsiderInfoMessage::new);

    res.put(
        6230,
        com.ankamagames.dofus.network.messages.game.shortcut.ShortcutBarSwapRequestMessage::new);

    res.put(
        6115, com.ankamagames.dofus.network.messages.game.guild.GuildInvitationByNameMessage::new);

    res.put(
        6089,
        () ->
            com.ankamagames.dofus.network.messages.game.context.notification
                .NotificationResetMessage.i);

    res.put(
        6571,
        com.ankamagames.dofus.network.messages.game.interactive.zaap.ZaapRespawnUpdatedMessage
            ::new);

    res.put(
        6683,
        com.ankamagames.dofus.network.messages.game.alliance.AllianceMotdSetErrorMessage::new);

    res.put(
        6098,
        com.ankamagames.dofus.network.messages.game.context.roleplay.quest
                .QuestObjectiveValidatedMessage
            ::new);

    res.put(
        5982, () -> com.ankamagames.dofus.network.messages.game.context.mount.MountUnSetMessage.i);

    res.put(
        5691,
        com.ankamagames.dofus.network.messages.game.context.roleplay.emote.EmotePlayMassiveMessage
            ::new);

    res.put(
        5540,
        com.ankamagames.dofus.network.messages.game.actions.fight.GameActionFightMarkCellsMessage
            ::new);

    res.put(
        6537,
        com.ankamagames.dofus.network.messages.game.startup.StartupActionsAllAttributionMessage
            ::new);

    res.put(
        6699,
        com.ankamagames.dofus.network.messages.game.context.fight.RefreshCharacterStatsMessage
            ::new);

    res.put(
        5654,
        com.ankamagames.dofus.network.messages.game.context.roleplay.job.JobExperienceUpdateMessage
            ::new);

    res.put(
        6067,
        com.ankamagames.dofus.network.messages.game.context.fight.GameFightResumeMessage::new);

    res.put(
        5647,
        com.ankamagames.dofus.network.messages.game.inventory.storage.StorageObjectUpdateMessage
            ::new);

    res.put(
        6308, com.ankamagames.dofus.network.messages.game.context.mount.MountReleasedMessage::new);

    res.put(
        6140,
        com.ankamagames.dofus.network.messages.game.context.roleplay.houses.HouseToSellListMessage
            ::new);

    res.put(
        6070,
        com.ankamagames.dofus.network.messages.game.actions.fight
                .GameActionFightDispellableEffectMessage
            ::new);

    res.put(
        6301,
        com.ankamagames.dofus.network.messages.game.context.roleplay.fight.arena
                .GameRolePlayArenaUpdatePlayerInfosMessage
            ::new);

    res.put(6538, com.ankamagames.dofus.network.messages.game.startup.StartupActionAddMessage::new);

    res.put(
        5977,
        com.ankamagames.dofus.network.messages.game.context.mount.MountSterilizedMessage::new);

    res.put(
        5532,
        com.ankamagames.dofus.network.messages.game.actions.fight.GameActionFightChangeLookMessage
            ::new);

    res.put(
        6252,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party.PartyMemberEjectedMessage
            ::new);

    res.put(
        6507,
        com.ankamagames
                .dofus
                .network
                .messages
                .game
                .context
                .roleplay
                .treasureHunt
                .TreasureHuntFlagRequestAnswerMessage
            ::new);

    res.put(
        6618,
        com.ankamagames.dofus.network.messages.game.context.GameRefreshMonsterBoostsMessage::new);

    res.put(
        6221,
        com.ankamagames.dofus.network.messages.game.actions.fight
                .GameActionFightSpellImmunityMessage
            ::new);

    res.put(
        152,
        com.ankamagames.dofus.network.messages.game.character.choice.CharacterSelectionMessage
            ::new);

    res.put(5502, com.ankamagames.dofus.network.messages.game.dialog.LeaveDialogMessage::new);

    res.put(
        6447,
        com.ankamagames.dofus.network.messages.game.alliance.AllianceModificationEmblemValidMessage
            ::new);

    res.put(
        5930, com.ankamagames.dofus.network.messages.game.guild.tax.TaxCollectorListMessage::new);

    res.put(5968, com.ankamagames.dofus.network.messages.game.context.mount.MountSetMessage::new);

    res.put(
        110, com.ankamagames.dofus.network.messages.game.approach.AuthenticationTicketMessage::new);

    res.put(880, com.ankamagames.dofus.network.messages.game.chat.ChatAbstractServerMessage::new);

    res.put(
        5772,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeOnHumanVendorRequestMessage
            ::new);

    res.put(
        162,
        () ->
            com.ankamagames.dofus.network.messages.game.character.creation
                .CharacterNameSuggestionRequestMessage.i);

    res.put(
        6311,
        com.ankamagames.dofus.network.messages.game.actions.fight
                .GameActionFightLifePointsGainMessage
            ::new);

    res.put(
        712, com.ankamagames.dofus.network.messages.game.context.fight.GameFightStartMessage::new);

    res.put(
        5550, com.ankamagames.dofus.network.messages.game.guild.GuildGetInformationsMessage::new);

    res.put(
        5508,
        () ->
            com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeAcceptMessage
                .i);

    res.put(
        6087,
        com.ankamagames.dofus.network.messages.game.context.notification.NotificationListMessage
            ::new);

    res.put(6731, com.ankamagames.dofus.network.messages.connection.MigratedServerListMessage::new);

    res.put(
        6390, com.ankamagames.dofus.network.messages.game.alliance.AllianceMembershipMessage::new);

    res.put(
        5739,
        com.ankamagames.dofus.network.messages.game.context.roleplay.purchasable
                .PurchasableDialogMessage
            ::new);

    res.put(
        6238,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeObjectModifyPricedMessage
            ::new);

    res.put(
        6460,
        com.ankamagames.dofus.network.messages.game.inventory.items
                .MimicryObjectFeedAndAssociateRequestMessage
            ::new);

    res.put(6371, com.ankamagames.dofus.network.messages.game.tinsel.TitleLostMessage::new);

    res.put(
        6435, com.ankamagames.dofus.network.messages.game.guild.GuildVersatileInfoListMessage::new);

    res.put(
        3029,
        com.ankamagames.dofus.network.messages.game.inventory.items.ObjectModifiedMessage::new);

    res.put(
        6567,
        () ->
            com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeStartOkRunesTradeMessage.i);

    res.put(
        5769,
        () ->
            com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ItemNoMoreAvailableMessage.i);

    res.put(881, com.ankamagames.dofus.network.messages.game.chat.ChatServerMessage::new);

    res.put(
        6726, com.ankamagames.dofus.network.messages.game.house.HouseTeleportRequestMessage::new);

    res.put(
        718,
        com.ankamagames.dofus.network.messages.game.context.fight.GameFightTurnFinishMessage::new);

    res.put(
        5976,
        () ->
            com.ankamagames.dofus.network.messages.game.context.mount
                .MountToggleRidingRequestMessage.i);

    res.put(
        5588,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .PartyFollowThisMemberRequestMessage
            ::new);

    res.put(
        6630,
        com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag
                .RoomAvailableUpdateMessage
            ::new);

    res.put(
        5544,
        com.ankamagames.dofus.network.messages.game.character.creation
                .CharacterNameSuggestionSuccessMessage
            ::new);

    res.put(
        6713,
        com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag.meeting
                .HavenBagPermissionsUpdateMessage
            ::new);

    res.put(
        5920,
        () -> com.ankamagames.dofus.network.messages.game.guild.GuildCreationStartedMessage.i);

    res.put(
        5503, com.ankamagames.dofus.network.messages.game.inventory.items.SetUpdateMessage::new);

    res.put(
        5751,
        com.ankamagames.dofus.network.messages.game.context.roleplay.MapRunningFightDetailsMessage
            ::new);

    res.put(
        6097,
        com.ankamagames.dofus.network.messages.game.context.roleplay.quest.QuestValidatedMessage
            ::new);

    res.put(
        6091,
        com.ankamagames.dofus.network.messages.game.context.roleplay.quest.QuestStartedMessage
            ::new);

    res.put(
        6535,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeObjectsAddedMessage
            ::new);

    res.put(
        5699,
        com.ankamagames.dofus.network.messages.game.guild.GuildSpellUpgradeRequestMessage::new);

    res.put(
        703,
        com.ankamagames.dofus.network.messages.game.context.fight
                .GameFightPlacementPossiblePositionsMessage
            ::new);

    res.put(
        6488,
        com.ankamagames
                .dofus
                .network
                .messages
                .game
                .context
                .roleplay
                .treasureHunt
                .TreasureHuntRequestMessage
            ::new);

    res.put(6667, com.ankamagames.dofus.network.messages.game.dare.DareErrorMessage::new);

    res.put(
        5696,
        com.ankamagames.dofus.network.messages.game.context.GameEntitiesDispositionMessage::new);

    res.put(
        6284,
        com.ankamagames.dofus.network.messages.game.context.roleplay.fight.arena
                .GameRolePlayArenaRegistrationStatusMessage
            ::new);

    res.put(
        6469,
        com.ankamagames.dofus.network.messages.connection.SelectedServerDataExtendedMessage::new);

    res.put(5678, com.ankamagames.dofus.network.messages.game.friend.IgnoredAddedMessage::new);

    res.put(
        6736, com.ankamagames.dofus.network.messages.game.inventory.AbstractPresetSaveMessage::new);

    res.put(
        6310,
        com.ankamagames.dofus.network.messages.game.actions.fight
                .GameActionFightLifeAndShieldPointsLostMessage
            ::new);

    res.put(
        6520,
        com.ankamagames.dofus.network.messages.game.inventory.items.ObtainedItemWithBonusMessage
            ::new);

    res.put(2001, com.ankamagames.dofus.network.messages.debug.DebugHighlightCellsMessage::new);

    res.put(
        5648,
        com.ankamagames.dofus.network.messages.game.inventory.storage.StorageObjectRemoveMessage
            ::new);

    res.put(
        6124,
        () ->
            com.ankamagames.dofus.network.messages.game.context.roleplay
                .StopToListenRunningFightRequestMessage.i);

    res.put(6045, com.ankamagames.dofus.network.messages.game.social.ContactLookErrorMessage::new);

    res.put(
        1002, () -> com.ankamagames.dofus.network.messages.game.actions.GameActionNoopMessage.i);

    res.put(
        5967, com.ankamagames.dofus.network.messages.game.context.mount.MountRidingMessage::new);

    res.put(
        6455,
        com.ankamagames.dofus.network.messages.game.guild.tax.TaxCollectorStateUpdateMessage::new);

    res.put(
        6533,
        com.ankamagames.dofus.network.messages.game.inventory.items.ExchangeObjectsModifiedMessage
            ::new);

    res.put(
        6739,
        () ->
            com.ankamagames.dofus.network.messages.game.character.stats
                .ResetCharacterStatsRequestMessage.i);

    res.put(
        6734,
        com.ankamagames.dofus.network.messages.game.inventory.AbstractPresetSaveResultMessage::new);

    res.put(6041, com.ankamagames.dofus.network.messages.game.prism.PrismUseRequestMessage::new);

    res.put(
        5892,
        com.ankamagames.dofus.network.messages.game.prism.PrismFightDefenderLeaveMessage::new);

    res.put(75, com.ankamagames.dofus.network.messages.authorized.ConsoleMessage::new);

    res.put(
        5633,
        com.ankamagames.dofus.network.messages.game.guild.tax.TaxCollectorMovementMessage::new);

    res.put(
        5610,
        com.ankamagames.dofus.network.messages.game.context.roleplay.stats
                .StatsUpgradeRequestMessage
            ::new);

    res.put(
        6596,
        com.ankamagames.dofus.network.messages.game.chat.smiley.ChatSmileyExtraPackListMessage
            ::new);

    res.put(
        6032,
        () ->
            com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeObjectTransfertAllToInvMessage.i);

    res.put(
        5684,
        com.ankamagames.dofus.network.messages.game.character.stats.LifePointsRegenBeginMessage
            ::new);

    res.put(
        5668,
        com.ankamagames.dofus.network.messages.game.context.roleplay.lockable
                .LockableStateUpdateHouseDoorMessage
            ::new);

    res.put(
        6555,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeMountsStableAddMessage
            ::new);

    res.put(6053, com.ankamagames.dofus.network.messages.game.script.CinematicMessage::new);

    res.put(6402, com.ankamagames.dofus.network.messages.game.alliance.AllianceJoinedMessage::new);

    res.put(
        5734,
        com.ankamagames.dofus.network.messages.game.context.roleplay.houses.HousePropertiesMessage
            ::new);

    res.put(
        6378,
        com.ankamagames.dofus.network.messages.game.achievement.AchievementDetailsMessage::new);

    res.put(
        6249,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .DungeonPartyFinderRegisterRequestMessage
            ::new);

    res.put(
        6307,
        com.ankamagames.dofus.network.messages.game.context.fight.GameFightTurnResumeMessage::new);

    res.put(
        5595,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party.PartyLocateMembersMessage
            ::new);

    res.put(10, com.ankamagames.dofus.network.messages.queues.LoginQueueStatusMessage::new);

    res.put(
        6626,
        () ->
            com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag
                .EditHavenBagRequestMessage.i);

    res.put(
        5895, com.ankamagames.dofus.network.messages.game.prism.PrismFightDefenderAddMessage::new);

    res.put(
        6254,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .PartyCancelInvitationMessage
            ::new);

    res.put(
        6314,
        () ->
            com.ankamagames.dofus.network.messages.connection.CredentialsAcknowledgementMessage.i);

    res.put(
        6694,
        com.ankamagames.dofus.network.messages.game.guild.GuildBulletinSetRequestMessage::new);

    res.put(6583, com.ankamagames.dofus.network.messages.game.idol.IdolPartyRefreshMessage::new);

    res.put(
        6696,
        () ->
            com.ankamagames.dofus.network.messages.game.context.mount
                .MountHarnessDissociateRequestMessage.i);

    res.put(20, com.ankamagames.dofus.network.messages.connection.IdentificationFailedMessage::new);

    res.put(
        6545,
        com.ankamagames.dofus.network.messages.game.actions.fight
                .GameActionFightActivateGlyphTrapMessage
            ::new);

    res.put(
        5986,
        () ->
            com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeRequestOnMountStockMessage.i);

    res.put(
        6399,
        com.ankamagames.dofus.network.messages.game.alliance.AllianceGuildLeavingMessage::new);

    res.put(
        6242,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .DungeonPartyFinderAvailableDungeonsMessage
            ::new);

    res.put(
        6395, com.ankamagames.dofus.network.messages.game.alliance.AllianceInvitationMessage::new);

    res.put(
        6675,
        com.ankamagames.dofus.network.messages.game.dare.DareRewardConsumeValidationMessage::new);

    res.put(
        3009,
        com.ankamagames.dofus.network.messages.game.inventory.items.InventoryWeightMessage::new);

    res.put(
        6702,
        () ->
            com.ankamagames.dofus.network.messages.game.finishmoves.FinishMoveListRequestMessage.i);

    res.put(
        5688,
        com.ankamagames.dofus.network.messages.game.context.roleplay.emote.EmotePlayErrorMessage
            ::new);

    res.put(
        5810,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeItemAutoCraftStopedMessage
            ::new);

    res.put(
        6214,
        com.ankamagames.dofus.network.messages.game.context.fight.SlaveSwitchContextMessage::new);

    res.put(
        6485,
        com.ankamagames
                .dofus
                .network
                .messages
                .game
                .context
                .roleplay
                .treasureHunt
                .TreasureHuntDigRequestMessage
            ::new);

    res.put(
        5925,
        com.ankamagames.dofus.network.messages.game.context.roleplay.objects
                .ObjectGroundListAddedMessage
            ::new);

    res.put(
        5844,
        com.ankamagames.dofus.network.messages.game.prism.PrismInfoJoinLeaveRequestMessage::new);

    res.put(
        5805,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeBidHousePriceMessage
            ::new);

    res.put(
        5520,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeObjectMoveKamaMessage
            ::new);

    res.put(
        5944,
        com.ankamagames.dofus.network.messages.game.context.roleplay.objects
                .ObjectGroundRemovedMultipleMessage
            ::new);

    res.put(1502, com.ankamagames.dofus.network.messages.updater.parts.PartsListMessage::new);

    res.put(
        6497,
        com.ankamagames.dofus.network.messages.game.context.GameCautiousMapMovementMessage::new);

    res.put(
        6235,
        com.ankamagames.dofus.network.messages.game.guild.tax.GuildFightTakePlaceRequestMessage
            ::new);

    res.put(
        6714,
        com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag.meeting
                .HavenBagPermissionsUpdateRequestMessage
            ::new);

    res.put(
        5579,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party.PartyMemberRemoveMessage
            ::new);

    res.put(6663, com.ankamagames.dofus.network.messages.game.dare.DareCreatedListMessage::new);

    res.put(
        5652,
        com.ankamagames.dofus.network.messages.game.context.roleplay.job
                .JobCrafterDirectorySettingsMessage
            ::new);

    res.put(6581, com.ankamagames.dofus.network.messages.game.idol.IdolSelectedMessage::new);

    res.put(
        6169,
        com.ankamagames.dofus.network.messages.game.inventory.preset.InventoryPresetDeleteMessage
            ::new);

    res.put(
        6686,
        () -> com.ankamagames.dofus.network.messages.game.social.SocialNoticeSetRequestMessage.i);

    res.put(
        5685,
        com.ankamagames.dofus.network.messages.game.context.roleplay.emote.EmotePlayRequestMessage
            ::new);

    res.put(
        6114,
        com.ankamagames.dofus.network.messages.game.context.roleplay.visual
                .GameRolePlaySpellAnimMessage
            ::new);

    res.put(
        3010,
        com.ankamagames.dofus.network.messages.game.inventory.items.ObjectMovementMessage::new);

    res.put(
        5698,
        com.ankamagames.dofus.network.messages.game.context.roleplay.houses.HouseKickRequestMessage
            ::new);

    res.put(
        5656,
        com.ankamagames.dofus.network.messages.game.context.roleplay.job.JobLevelUpMessage::new);

    res.put(
        6078,
        com.ankamagames.dofus.network.messages.game.friend.FriendWarnOnLevelGainStateMessage::new);

    res.put(
        6020,
        com.ankamagames.dofus.network.messages.game.inventory.items
                .ExchangeMultiCraftCrafterCanUseHisRessourcesMessage
            ::new);

    res.put(
        6715,
        com.ankamagames.dofus.network.messages.game.interactive.skill
                .InteractiveUseWithParamRequestMessage
            ::new);

    res.put(6368, com.ankamagames.dofus.network.messages.game.tinsel.OrnamentGainedMessage::new);

    res.put(
        5522,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeRequestedMessage
            ::new);

    res.put(
        5715,
        com.ankamagames.dofus.network.messages.game.guild.tax.GuildFightLeaveRequestMessage::new);

    res.put(6657, com.ankamagames.dofus.network.messages.game.dare.DareVersatileListMessage::new);

    res.put(
        6037,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeShopStockMultiMovementRemovedMessage
            ::new);

    res.put(
        5979,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeStartOkMountMessage
            ::new);

    res.put(
        6304,
        com.ankamagames.dofus.network.messages.game.actions.fight
                .GameActionFightModifyEffectsDurationMessage
            ::new);

    res.put(6685, com.ankamagames.dofus.network.messages.game.alliance.AllianceMotdMessage::new);

    res.put(
        5644,
        com.ankamagames.dofus.network.messages.game.context.roleplay.emote.EmoteAddMessage::new);

    res.put(5934, com.ankamagames.dofus.network.messages.game.social.ContactLookMessage::new);

    res.put(
        6512,
        com.ankamagames.dofus.network.messages.game.context.roleplay.death.WarnOnPermaDeathMessage
            ::new);

    res.put(
        5828,
        com.ankamagames.dofus.network.messages.game.actions.fight
                .GameActionFightDodgePointLossMessage
            ::new);

    res.put(
        6474,
        com.ankamagames.dofus.network.messages.game.context.fight
                .GameFightSpectatePlayerRequestMessage
            ::new);

    res.put(6408, com.ankamagames.dofus.network.messages.game.alliance.AllianceListMessage::new);

    res.put(
        6707,
        com.ankamagames.dofus.network.messages.game.context.roleplay.spell
                .SpellVariantActivationRequestMessage
            ::new);

    res.put(
        5603, com.ankamagames.dofus.network.messages.game.friend.FriendDeleteRequestMessage::new);

    res.put(
        6147,
        com.ankamagames.dofus.network.messages.game.actions.fight
                .GameActionFightTriggerEffectMessage
            ::new);

    res.put(
        6401,
        com.ankamagames.dofus.network.messages.game.alliance.AllianceInvitationAnswerMessage::new);

    res.put(
        5817,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeStartOkMulticraftCustomerMessage
            ::new);

    res.put(
        6738,
        com.ankamagames.dofus.network.messages.game.context.roleplay.CurrentMapInstanceMessage
            ::new);

    res.put(
        5548,
        com.ankamagames.dofus.network.messages.game.guild.GuildInvitationStateRecrutedMessage::new);

    res.put(
        5825,
        com.ankamagames.dofus.network.messages.game.actions.fight.GameActionFightSummonMessage
            ::new);

    res.put(
        5787,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeReplyTaxVendorMessage
            ::new);

    res.put(
        5824,
        com.ankamagames.dofus.network.messages.game.context.roleplay.paddock
                .PaddockPropertiesMessage
            ::new);

    res.put(
        6348, com.ankamagames.dofus.network.messages.web.krosmaster.KrosmasterTransferMessage::new);

    res.put(
        6387,
        com.ankamagames.dofus.network.messages.game.character.status
                .PlayerStatusUpdateRequestMessage
            ::new);

    res.put(
        6377,
        com.ankamagames.dofus.network.messages.game.achievement.AchievementRewardRequestMessage
            ::new);

    res.put(
        5593,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party.PartyLeaveRequestMessage
            ::new);

    res.put(
        6606,
        com.ankamagames.dofus.network.messages.game.inventory.preset.IdolsPresetUpdateMessage::new);

    res.put(
        6400, com.ankamagames.dofus.network.messages.game.alliance.AllianceKickRequestMessage::new);

    res.put(
        6051,
        com.ankamagames.dofus.network.messages.game.context.roleplay.MapObstacleUpdateMessage::new);

    res.put(
        6033, com.ankamagames.dofus.network.messages.game.inventory.items.ObjectsAddedMessage::new);

    res.put(
        1302,
        () -> com.ankamagames.dofus.network.messages.game.startup.StartupActionsExecuteMessage.i);

    res.put(
        6690, com.ankamagames.dofus.network.messages.game.alliance.AllianceBulletinMessage::new);

    res.put(
        5793,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeWeightMessage::new);

    res.put(
        1001,
        com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionWithAckMessage::new);

    res.put(
        5645,
        com.ankamagames.dofus.network.messages.game.inventory.storage.StorageKamasUpdateMessage
            ::new);

    res.put(
        6298, com.ankamagames.dofus.network.messages.game.basic.NumericWhoIsRequestMessage::new);

    res.put(
        5596,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .PartyRefuseInvitationNotificationMessage
            ::new);

    res.put(
        1604, com.ankamagames.dofus.network.messages.game.interactive.zaap.ZaapListMessage::new);

    res.put(
        6442, () -> com.ankamagames.dofus.network.messages.game.prism.PrismSettingsErrorMessage.i);

    res.put(850, com.ankamagames.dofus.network.messages.game.chat.ChatAbstractClientMessage::new);

    res.put(
        5609,
        com.ankamagames.dofus.network.messages.game.context.roleplay.stats.StatsUpgradeResultMessage
            ::new);

    res.put(
        3016,
        com.ankamagames.dofus.network.messages.game.inventory.items.InventoryContentMessage::new);

    res.put(
        6024,
        () -> com.ankamagames.dofus.network.messages.game.context.GameContextCreateErrorMessage.i);

    res.put(
        6727,
        com.ankamagames.dofus.network.messages.game.context.roleplay.houses
                .HouseSellingUpdateMessage
            ::new);

    res.put(
        6344,
        () ->
            com.ankamagames.dofus.network.messages.web.krosmaster.KrosmasterInventoryRequestMessage
                .i);

    res.put(
        6655,
        com.ankamagames.dofus.network.messages.game.context.roleplay.spell.SpellModifyRequestMessage
            ::new);

    res.put(
        5519,
        com.ankamagames.dofus.network.messages.game.inventory.items.ExchangeObjectModifiedMessage
            ::new);

    res.put(
        6274,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party.AbstractPartyMessage
            ::new);

    res.put(
        6445,
        com.ankamagames.dofus.network.messages.game.context.roleplay.npc
                .AllianceTaxCollectorDialogQuestionExtendedMessage
            ::new);

    res.put(
        6343,
        com.ankamagames.dofus.network.messages.web.krosmaster.KrosmasterInventoryErrorMessage::new);

    res.put(
        5591, com.ankamagames.dofus.network.messages.game.atlas.compass.CompassUpdateMessage::new);

    res.put(
        5655,
        com.ankamagames.dofus.network.messages.game.context.roleplay.job.JobDescriptionMessage
            ::new);

    res.put(
        6383,
        com.ankamagames.dofus.network.messages.game.achievement
                .FriendGuildWarnOnAchievementCompleteStateMessage
            ::new);

    res.put(
        5996,
        com.ankamagames.dofus.network.messages.game.context.roleplay.death
                .GameRolePlayPlayerLifeStatusMessage
            ::new);

    res.put(
        221, com.ankamagames.dofus.network.messages.game.context.roleplay.ChangeMapMessage::new);

    res.put(
        5525,
        com.ankamagames.dofus.network.messages.game.actions.fight.GameActionFightSlideMessage::new);

    res.put(
        6666, com.ankamagames.dofus.network.messages.game.dare.DareSubscribeRequestMessage::new);

    res.put(
        945,
        com.ankamagames.dofus.network.messages.game.context.GameMapChangeOrientationRequestMessage
            ::new);

    res.put(
        6283,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .PartyInvitationArenaRequestMessage
            ::new);

    res.put(
        5577,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .PartyFollowMemberRequestMessage
            ::new);

    res.put(
        6222,
        com.ankamagames.dofus.network.messages.game.shortcut.ShortcutBarRemoveErrorMessage::new);

    res.put(
        6676,
        com.ankamagames.dofus.network.messages.game.dare.DareRewardConsumeRequestMessage::new);

    res.put(
        6652,
        com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag
                .KickHavenBagRequestMessage
            ::new);

    res.put(
        6113,
        com.ankamagames.dofus.network.messages.game.actions.fight
                .GameActionFightDispellEffectMessage
            ::new);

    res.put(
        5963,
        com.ankamagames.dofus.network.messages.game.context.mount.MountEquipedErrorMessage::new);

    res.put(5636, com.ankamagames.dofus.network.messages.game.guild.GuildInfosUpgradeMessage::new);

    res.put(
        6464,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeBidPriceForSellerMessage
            ::new);

    res.put(
        6326,
        () ->
            com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeObjectTransfertExistingToInvMessage.i);

    res.put(
        6381,
        com.ankamagames.dofus.network.messages.game.achievement
                .AchievementFinishedInformationMessage
            ::new);

    res.put(
        6457,
        com.ankamagames.dofus.network.messages.game.inventory.items.MimicryObjectEraseRequestMessage
            ::new);

    res.put(
        5929,
        com.ankamagames.dofus.network.messages.game.guild.tax.GuildFightPlayersEnemyRemoveMessage
            ::new);

    res.put(
        5962,
        () ->
            com.ankamagames.dofus.network.messages.game.context.mount.MountSterilizeRequestMessage
                .i);

    res.put(6134, com.ankamagames.dofus.network.messages.game.moderation.PopupWarningMessage::new);

    res.put(
        6345,
        com.ankamagames.dofus.network.messages.web.krosmaster.KrosmasterAuthTokenErrorMessage::new);

    res.put(
        5509,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeIsReadyMessage
            ::new);

    res.put(5599, com.ankamagames.dofus.network.messages.game.friend.FriendAddedMessage::new);

    res.put(
        5585,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .PartyInvitationRequestMessage
            ::new);

    res.put(
        6516,
        com.ankamagames.dofus.network.messages.game.context.mount.PaddockBuyResultMessage::new);

    res.put(6661, com.ankamagames.dofus.network.messages.game.dare.DareListMessage::new);

    res.put(
        884, com.ankamagames.dofus.network.messages.game.chat.ChatServerCopyWithObjectMessage::new);

    res.put(
        5748,
        com.ankamagames.dofus.network.messages.game.context.roleplay.job
                .JobAllowMultiCraftRequestMessage
            ::new);

    res.put(
        5915,
        com.ankamagames.dofus.network.messages.game.guild.tax.TaxCollectorMovementRemoveMessage
            ::new);

    res.put(
        6619,
        () ->
            com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag
                .EditHavenBagCancelRequestMessage.i);

    res.put(
        6296,
        com.ankamagames.dofus.network.messages.game.context.dungeon.DungeonKeyRingUpdateMessage
            ::new);

    res.put(
        5687,
        com.ankamagames.dofus.network.messages.game.context.roleplay.emote.EmoteRemoveMessage::new);

    res.put(6265, com.ankamagames.dofus.network.messages.game.friend.SpouseStatusMessage::new);

    res.put(
        6589,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeStoppedMessage
            ::new);

    res.put(
        715,
        com.ankamagames.dofus.network.messages.game.context.fight.GameFightTurnReadyRequestMessage
            ::new);

    res.put(
        5768,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeOkMultiCraftMessage
            ::new);

    res.put(
        6211,
        com.ankamagames.dofus.network.messages.game.inventory.preset
                .InventoryPresetItemUpdateErrorMessage
            ::new);

    res.put(
        953, com.ankamagames.dofus.network.messages.game.context.GameMapMovementCancelMessage::new);

    res.put(
        5556, com.ankamagames.dofus.network.messages.game.guild.GuildInvitationAnswerMessage::new);

    res.put(
        167,
        com.ankamagames.dofus.network.messages.game.character.replay.CharacterReplayRequestMessage
            ::new);

    res.put(
        740,
        com.ankamagames.dofus.network.messages.game.context.fight.GameFightHumanReadyStateMessage
            ::new);

    res.put(
        5557,
        com.ankamagames.dofus.network.messages.game.guild.GuildInformationsGeneralMessage::new);

    res.put(
        6174,
        com.ankamagames.dofus.network.messages.connection.IdentificationFailedBannedMessage::new);

    res.put(6398, () -> com.ankamagames.dofus.network.messages.game.alliance.AllianceLeftMessage.i);

    res.put(
        707,
        com.ankamagames.dofus.network.messages.game.context.fight.GameFightOptionToggleMessage
            ::new);

    res.put(
        5672,
        com.ankamagames.dofus.network.messages.game.context.roleplay.lockable
                .LockableCodeResultMessage
            ::new);

    res.put(
        5533,
        com.ankamagames.dofus.network.messages.game.actions.fight.GameActionFightDispellMessage
            ::new);

    res.put(
        6189,
        com.ankamagames.dofus.network.messages.game.context.mount.MountFeedRequestMessage::new);

    res.put(
        6384,
        com.ankamagames.dofus.network.messages.game.interactive.InteractiveUseErrorMessage::new);

    res.put(
        5571,
        com.ankamagames.dofus.network.messages.game.actions.fight.GameActionFightKillMessage::new);

    res.put(
        6422, com.ankamagames.dofus.network.messages.game.guild.GuildInAllianceFactsMessage::new);

    res.put(5679, com.ankamagames.dofus.network.messages.game.friend.IgnoredAddFailureMessage::new);

    res.put(
        6664,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeStartedTaxCollectorShopMessage
            ::new);

    res.put(
        6524,
        com.ankamagames.dofus.network.messages.game.inventory.items
                .WrapperObjectDissociateRequestMessage
            ::new);

    res.put(
        5933,
        com.ankamagames.dofus.network.messages.game.social.ContactLookRequestByNameMessage::new);

    res.put(
        6409,
        com.ankamagames.dofus.network.messages.game.alliance.AllianceFactsRequestMessage::new);

    res.put(
        704,
        com.ankamagames.dofus.network.messages.game.context.fight
                .GameFightPlacementPositionRequestMessage
            ::new);

    res.put(
        5989,
        com.ankamagames.dofus.network.messages.game.context.mount.MountSetXpRatioRequestMessage
            ::new);

    res.put(
        5990,
        com.ankamagames.dofus.network.messages.game.context.mount.GameDataPaddockObjectAddMessage
            ::new);

    res.put(
        6604,
        com.ankamagames.dofus.network.messages.game.inventory.preset.IdolsPresetSaveResultMessage
            ::new);

    res.put(
        3024,
        com.ankamagames.dofus.network.messages.game.inventory.items.ObjectDeletedMessage::new);

    res.put(
        6090,
        com.ankamagames.dofus.network.messages.game.context.notification
                .NotificationUpdateFlagMessage
            ::new);

    res.put(
        6357,
        com.ankamagames.dofus.network.messages.game.achievement
                .AchievementDetailedListRequestMessage
            ::new);

    res.put(
        6607,
        () ->
            com.ankamagames.dofus.network.messages.connection.register.AccountLinkRequiredMessage
                .i);

    res.put(
        6216, com.ankamagames.dofus.network.messages.game.approach.AccountCapabilitiesMessage::new);

    res.put(
        5735,
        com.ankamagames.dofus.network.messages.game.context.roleplay.houses.HouseBuyResultMessage
            ::new);

    res.put(
        109, () -> com.ankamagames.dofus.network.messages.game.approach.AlreadyConnectedMessage.i);

    res.put(
        892, com.ankamagames.dofus.network.messages.game.chat.channel.EnabledChannelsMessage::new);

    res.put(
        6170,
        com.ankamagames.dofus.network.messages.game.inventory.preset
                .InventoryPresetSaveResultMessage
            ::new);

    res.put(
        6061,
        com.ankamagames.dofus.network.messages.game.guild.GuildMemberOnlineStatusMessage::new);

    res.put(6587, com.ankamagames.dofus.network.messages.game.idol.IdolSelectRequestMessage::new);

    res.put(6415, com.ankamagames.dofus.network.messages.game.guild.GuildFactsMessage::new);

    res.put(
        6219,
        com.ankamagames.dofus.network.messages.game.actions.fight
                .GameActionFightSpellCooldownVariationMessage
            ::new);

    res.put(
        6237,
        com.ankamagames.dofus.network.messages.game.initialization
                .ServerExperienceModificatorMessage
            ::new);

    res.put(
        1005,
        com.ankamagames.dofus.network.messages.game.actions.fight.GameActionFightCastRequestMessage
            ::new);

    res.put(
        5992,
        com.ankamagames.dofus.network.messages.game.context.mount
                .GameDataPaddockObjectListAddMessage
            ::new);

    res.put(30, com.ankamagames.dofus.network.messages.connection.ServersListMessage::new);

    res.put(
        6001,
        () ->
            com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeReplayStopMessage.i);

    res.put(6506, com.ankamagames.dofus.network.messages.game.guest.GuestLimitationMessage::new);

    res.put(
        6491,
        com.ankamagames
                .dofus
                .network
                .messages
                .game
                .context
                .roleplay
                .treasureHunt
                .TreasureHuntAvailableRetryCountUpdateMessage
            ::new);

    res.put(
        6234,
        com.ankamagames.dofus.network.messages.game.inventory.items.ObjectUseMultipleMessage::new);

    res.put(1508, com.ankamagames.dofus.network.messages.updater.parts.PartInfoMessage::new);

    res.put(
        6712,
        com.ankamagames.dofus.network.messages.game.context.roleplay
                .GameRolePlayShowMultipleActorsMessage
            ::new);

    res.put(6591, com.ankamagames.dofus.network.messages.game.guild.GuildMotdSetErrorMessage::new);

    res.put(
        6167,
        com.ankamagames.dofus.network.messages.game.inventory.preset.InventoryPresetUseMessage
            ::new);

    res.put(
        6263,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .PartyInvitationDetailsMessage
            ::new);

    res.put(
        6143,
        com.ankamagames.dofus.network.messages.connection.search.AcquaintanceSearchErrorMessage
            ::new);

    res.put(
        6382,
        com.ankamagames.dofus.network.messages.game.achievement
                .FriendGuildSetWarnOnAchievementCompleteMessage
            ::new);

    res.put(
        5959,
        com.ankamagames.dofus.network.messages.game.guild.GuildInformationsPaddocksMessage::new);

    res.put(5673, com.ankamagames.dofus.network.messages.game.friend.IgnoredAddRequestMessage::new);

    res.put(
        5515,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeObjectMessage::new);

    res.put(
        6138,
        com.ankamagames.dofus.network.messages.game.context.roleplay.paddock
                .PaddockToSellListMessage
            ::new);

    res.put(
        6052,
        com.ankamagames.dofus.network.messages.game.context.mount.PaddockMoveItemRequestMessage
            ::new);

    res.put(
        6563,
        com.ankamagames.dofus.network.messages.game.context.display
                .DisplayNumericalValuePaddockMessage
            ::new);

    res.put(
        6531,
        () ->
            com.ankamagames.dofus.network.messages.game.prism.PrismModuleExchangeRequestMessage.i);

    res.put(
        5731,
        com.ankamagames.dofus.network.messages.game.context.roleplay.fight
                .GameRolePlayPlayerFightRequestMessage
            ::new);

    res.put(5674, com.ankamagames.dofus.network.messages.game.friend.IgnoredListMessage::new);

    res.put(
        6246,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .DungeonPartyFinderListenRequestMessage
            ::new);

    res.put(
        5802,
        () ->
            com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeBidSearchOkMessage.i);

    res.put(
        6099,
        com.ankamagames.dofus.network.messages.game.context.roleplay.quest.QuestStepValidatedMessage
            ::new);

    res.put(
        701,
        com.ankamagames.dofus.network.messages.game.context.fight.GameFightJoinRequestMessage::new);

    res.put(
        5987,
        com.ankamagames.dofus.network.messages.game.context.mount.MountRenameRequestMessage::new);

    res.put(
        5743,
        com.ankamagames.dofus.network.messages.game.context.roleplay.MapRunningFightListMessage
            ::new);

    res.put(
        6703,
        com.ankamagames.dofus.network.messages.game.finishmoves.FinishMoveSetRequestMessage::new);

    res.put(
        6206,
        com.ankamagames.dofus.network.messages.game.inventory.items.ObjectsQuantityMessage::new);

    res.put(
        714,
        com.ankamagames.dofus.network.messages.game.context.fight.GameFightTurnStartMessage::new);

    res.put(
        5904,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeStartedBidBuyerMessage
            ::new);

    res.put(1810, com.ankamagames.dofus.network.messages.game.pvp.SetEnablePVPRequestMessage::new);

    res.put(
        3023,
        com.ankamagames.dofus.network.messages.game.inventory.items.ObjectQuantityMessage::new);

    res.put(
        6239,
        com.ankamagames.dofus.network.messages.game.context.fight.GameFightNewRoundMessage::new);

    res.put(
        6039,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeObjectTransfertListToInvMessage
            ::new);

    res.put(
        6227, com.ankamagames.dofus.network.messages.game.shortcut.ShortcutBarAddErrorMessage::new);

    res.put(181, com.ankamagames.dofus.network.messages.game.basic.BasicWhoIsRequestMessage::new);

    res.put(
        6380,
        com.ankamagames.dofus.network.messages.game.achievement.AchievementDetailsRequestMessage
            ::new);

    res.put(780, com.ankamagames.dofus.network.messages.game.basic.TextInformationMessage::new);

    res.put(
        6040, com.ankamagames.dofus.network.messages.game.prism.PrismFightStateUpdateMessage::new);

    res.put(
        6437, com.ankamagames.dofus.network.messages.game.prism.PrismSettingsRequestMessage::new);

    res.put(
        5818,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeStartOkMulticraftCrafterMessage
            ::new);

    res.put(
        6717,
        com.ankamagames.dofus.network.messages.game.context.roleplay.quest.FollowedQuestsMessage
            ::new);

    res.put(
        5829,
        com.ankamagames.dofus.network.messages.game.actions.fight
                .GameActionFightThrowCharacterMessage
            ::new);

    res.put(
        5582,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .PartyRefuseInvitationMessage
            ::new);

    res.put(
        6412,
        com.ankamagames.dofus.network.messages.game.context.GameContextRemoveElementWithEventMessage
            ::new);

    res.put(
        5580,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .PartyAcceptInvitationMessage
            ::new);

    res.put(
        5521,
        com.ankamagames.dofus.network.messages.game.inventory.items.ExchangeKamaModifiedMessage
            ::new);

    res.put(6404, com.ankamagames.dofus.network.messages.game.guild.GuildFactsRequestMessage::new);

    res.put(
        5948,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeBidHouseGenericItemRemovedMessage
            ::new);

    res.put(
        111,
        () ->
            com.ankamagames.dofus.network.messages.game.approach.AuthenticationTicketAcceptedMessage
                .i);

    res.put(
        5905,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeStartedBidSellerMessage
            ::new);

    res.put(
        6450,
        com.ankamagames.dofus.network.messages.game.alliance.AllianceModificationValidMessage::new);

    res.put(
        6529,
        com.ankamagames.dofus.network.messages.game.inventory.items.WrapperObjectErrorMessage::new);

    res.put(
        6407,
        com.ankamagames.dofus.network.messages.game.context.roleplay
                .GameRolePlayShowActorWithEventMessage
            ::new);

    res.put(
        6654,
        com.ankamagames.dofus.network.messages.game.context.roleplay.spell.SpellModifySuccessMessage
            ::new);

    res.put(
        6184,
        () ->
            com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeObjectTransfertAllFromInvMessage.i);

    res.put(
        6225,
        com.ankamagames.dofus.network.messages.game.shortcut.ShortcutBarAddRequestMessage::new);

    res.put(
        6551,
        com.ankamagames.dofus.network.messages.game.character.choice
                .CharacterReplayWithRemodelRequestMessage
            ::new);

    res.put(
        6330,
        com.ankamagames.dofus.network.messages.game.actions.fight
                .GameActionFightCastOnTargetRequestMessage
            ::new);

    res.put(
        5726,
        com.ankamagames.dofus.network.messages.game.initialization.OnConnectionEventMessage::new);

    res.put(
        5604,
        () -> com.ankamagames.dofus.network.messages.game.friend.FriendSpouseJoinRequestMessage.i);

    res.put(
        6561,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeMountsPaddockAddMessage
            ::new);

    res.put(
        5614,
        com.ankamagames.dofus.network.messages.game.context.fight.challenge
                .ChallengeTargetsListRequestMessage
            ::new);

    res.put(
        6165,
        com.ankamagames.dofus.network.messages.game.inventory.preset.InventoryPresetSaveMessage
            ::new);

    res.put(
        6557,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeMountsStableBornAddMessage
            ::new);

    res.put(
        5752,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeTypesItemsExchangerDescriptionForUserMessage
            ::new);

    res.put(
        6501,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party.PartyNameSetErrorMessage
            ::new);

    res.put(
        5941,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeStartOkCraftWithInformationMessage
            ::new);

    res.put(
        6010,
        com.ankamagames.dofus.network.messages.game.inventory.items
                .ExchangeObjectRemovedFromBagMessage
            ::new);

    res.put(
        5836,
        () ->
            com.ankamagames.dofus.network.messages.game.character.choice
                .CharacterSelectedErrorMessage.i);

    res.put(
        6209,
        com.ankamagames.dofus.network.messages.connection.IdentificationSuccessWithLoginTokenMessage
            ::new);

    res.put(
        6176,
        com.ankamagames.dofus.network.messages.game.actions.fight.GameActionFightDispellSpellMessage
            ::new);

    res.put(
        5773,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangePlayerRequestMessage
            ::new);

    res.put(6660, com.ankamagames.dofus.network.messages.game.dare.DareSubscribedMessage::new);

    res.put(
        5639,
        com.ankamagames.dofus.network.messages.connection.register.NicknameChoiceRequestMessage
            ::new);

    res.put(
        6036,
        com.ankamagames.dofus.network.messages.game.inventory.storage.StorageObjectsUpdateMessage
            ::new);

    res.put(
        6092,
        () ->
            com.ankamagames.dofus.network.messages.game.context.roleplay.quest
                .GuidedModeQuitRequestMessage.i);

    res.put(
        5907,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeShopStockMovementRemovedMessage
            ::new);

    res.put(
        41, com.ankamagames.dofus.network.messages.connection.SelectedServerRefusedMessage::new);

    res.put(
        5677, com.ankamagames.dofus.network.messages.game.friend.IgnoredDeleteResultMessage::new);

    res.put(
        6662,
        com.ankamagames.dofus.network.messages.common.basic.AggregateStatWithDataMessage::new);

    res.put(
        151,
        com.ankamagames.dofus.network.messages.game.character.choice.CharactersListMessage::new);

    res.put(6677, com.ankamagames.dofus.network.messages.game.dare.DareRewardsListMessage::new);

    res.put(
        6229, com.ankamagames.dofus.network.messages.game.shortcut.ShortcutBarRefreshMessage::new);

    res.put(
        6374, com.ankamagames.dofus.network.messages.game.tinsel.OrnamentSelectRequestMessage::new);

    res.put(
        6191,
        com.ankamagames.dofus.network.messages.game.context.roleplay.fight
                .GameRolePlayAttackMonsterRequestMessage
            ::new);

    res.put(
        6302,
        com.ankamagames.dofus.network.messages.game.interactive.meeting
                .TeleportBuddiesRequestedMessage
            ::new);

    res.put(
        6458,
        com.ankamagames.dofus.network.messages.game.inventory.items.MimicryObjectPreviewMessage
            ::new);

    res.put(
        6358,
        com.ankamagames.dofus.network.messages.game.achievement.AchievementDetailedListMessage
            ::new);

    res.put(5924, com.ankamagames.dofus.network.messages.game.friend.FriendUpdateMessage::new);

    res.put(
        6208,
        com.ankamagames.dofus.network.messages.game.achievement.AchievementFinishedMessage::new);

    res.put(
        5658,
        com.ankamagames.dofus.network.messages.game.character.stats.UpdateLifePointsMessage::new);

    res.put(
        6597,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeCraftCountRequestMessage
            ::new);

    res.put(
        6578,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeCraftPaymentModifiedMessage
            ::new);

    res.put(
        6068,
        com.ankamagames.dofus.network.messages.game.character.choice.CharacterSelectedForceMessage
            ::new);

    res.put(
        6634,
        com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag
                .HavenBagFurnituresMessage
            ::new);

    res.put(
        6142,
        com.ankamagames.dofus.network.messages.connection.search.AcquaintanceServerListMessage
            ::new);

    res.put(
        6544,
        com.ankamagames.dofus.network.messages.game.context.fight
                .GameFightPlacementSwapPositionsMessage
            ::new);

    res.put(
        6279,
        com.ankamagames.dofus.network.messages.game.context.roleplay.fight.arena
                .GameRolePlayArenaFightAnswerMessage
            ::new);

    res.put(
        5683,
        com.ankamagames.dofus.network.messages.game.context.roleplay.emote.EmotePlayMessage::new);

    res.put(6440, com.ankamagames.dofus.network.messages.game.prism.PrismsListMessage::new);

    res.put(200, com.ankamagames.dofus.network.messages.game.context.GameContextCreateMessage::new);

    res.put(
        2002, () -> com.ankamagames.dofus.network.messages.debug.DebugClearHighlightCellsMessage.i);

    res.put(
        721, com.ankamagames.dofus.network.messages.game.context.fight.GameFightLeaveMessage::new);

    res.put(1506, com.ankamagames.dofus.network.messages.updater.parts.GetPartInfoMessage::new);

    res.put(
        164,
        com.ankamagames.dofus.network.messages.game.character.creation
                .CharacterNameSuggestionFailureMessage
            ::new);

    res.put(
        5983, com.ankamagames.dofus.network.messages.game.context.mount.MountRenamedMessage::new);

    res.put(
        5512,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeStartedMessage
            ::new);

    res.put(
        6692,
        com.ankamagames.dofus.network.messages.game.alliance.AllianceBulletinSetErrorMessage::new);

    res.put(5607, com.ankamagames.dofus.network.messages.security.ClientKeyMessage::new);

    res.put(
        5747,
        com.ankamagames.dofus.network.messages.game.context.roleplay.job
                .JobMultiCraftAvailableSkillsMessage
            ::new);

    res.put(
        3019, com.ankamagames.dofus.network.messages.game.inventory.items.ObjectUseMessage::new);

    res.put(
        6499,
        com.ankamagames
                .dofus
                .network
                .messages
                .game
                .context
                .roleplay
                .treasureHunt
                .TreasureHuntLegendaryRequestMessage
            ::new);

    res.put(
        6635,
        () ->
            com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag
                .OpenHavenBagFurnitureSequenceRequestMessage.i);

    res.put(
        957,
        com.ankamagames.dofus.network.messages.game.actions.GameActionAcknowledgementMessage::new);

    res.put(
        6038,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeShopStockMultiMovementUpdatedMessage
            ::new);

    res.put(
        3005, com.ankamagames.dofus.network.messages.game.inventory.items.ObjectDropMessage::new);

    res.put(
        5618,
        com.ankamagames.dofus.network.messages.game.context.roleplay.npc.NpcDialogCreationMessage
            ::new);

    res.put(
        5806,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeBidHouseSearchMessage
            ::new);

    res.put(6452, com.ankamagames.dofus.network.messages.game.prism.PrismFightAddedMessage::new);

    res.put(
        6493,
        com.ankamagames.dofus.network.messages.game.modificator.AreaFightModificatorUpdateMessage
            ::new);

    res.put(
        891,
        com.ankamagames.dofus.network.messages.game.chat.channel.ChannelEnablingChangeMessage::new);

    res.put(
        1200, com.ankamagames.dofus.network.messages.game.inventory.spells.SpellListMessage::new);

    res.put(
        5626,
        com.ankamagames.dofus.network.messages.game.context.roleplay.quest.QuestListMessage::new);

    res.put(
        6732,
        () ->
            com.ankamagames.dofus.network.messages.game.character.creation
                .CharacterCanBeCreatedRequestMessage.i);

    res.put(
        719,
        com.ankamagames.dofus.network.messages.game.context.fight.GameFightTurnEndMessage::new);

    res.put(
        5803,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeBidHouseTypeMessage
            ::new);

    res.put(
        6188,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeCraftResultMagicWithObjectDescMessage
            ::new);

    res.put(
        5708,
        com.ankamagames.dofus.network.messages.game.interactive.InteractiveElementUpdatedMessage
            ::new);

    res.put(
        500,
        com.ankamagames.dofus.network.messages.game.character.stats.CharacterStatsListMessage::new);

    res.put(
        5955, com.ankamagames.dofus.network.messages.game.guild.GuildPaddockRemovedMessage::new);

    res.put(
        1000, com.ankamagames.dofus.network.messages.game.actions.AbstractGameActionMessage::new);

    res.put(
        5695,
        () ->
            com.ankamagames.dofus.network.messages.game.context.GameEntityDispositionErrorMessage
                .i);

    res.put(
        5693,
        com.ankamagames.dofus.network.messages.game.context.GameEntityDispositionMessage::new);

    res.put(
        6337,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeBidHouseInListUpdatedMessage
            ::new);

    res.put(6028, com.ankamagames.dofus.network.messages.debug.DebugInClientMessage::new);

    res.put(6580, com.ankamagames.dofus.network.messages.game.idol.IdolPartyLostMessage::new);

    res.put(
        6638,
        com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag
                .ChangeHavenBagRoomRequestMessage
            ::new);

    res.put(883, com.ankamagames.dofus.network.messages.game.chat.ChatServerWithObjectMessage::new);

    res.put(
        6030, com.ankamagames.dofus.network.messages.game.inventory.items.GoldAddedMessage::new);

    res.put(
        5613,
        com.ankamagames.dofus.network.messages.game.context.fight.challenge
                .ChallengeTargetsListMessage
            ::new);

    res.put(
        6470,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeObjectTransfertListWithQuantityToInvMessage
            ::new);

    res.put(
        6144,
        com.ankamagames.dofus.network.messages.connection.search.AcquaintanceSearchMessage::new);

    res.put(
        6299,
        com.ankamagames.dofus.network.messages.game.context.dungeon.DungeonKeyRingMessage::new);

    res.put(
        5573, com.ankamagames.dofus.network.messages.game.subscriber.SubscriptionZoneMessage::new);

    res.put(
        6306,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party.PartyNewMemberMessage
            ::new);

    res.put(5952, com.ankamagames.dofus.network.messages.game.guild.GuildPaddockBoughtMessage::new);

    res.put(
        6487,
        com.ankamagames
                .dofus
                .network
                .messages
                .game
                .context
                .roleplay
                .treasureHunt
                .TreasureHuntGiveUpRequestMessage
            ::new);

    res.put(
        6347,
        com.ankamagames.dofus.network.messages.web.krosmaster.KrosmasterPlayingStatusMessage::new);

    res.put(
        955,
        com.ankamagames.dofus.network.messages.game.actions.sequence.SequenceStartMessage::new);

    res.put(
        6611,
        com.ankamagames.dofus.network.messages.game.guild.tax.TaxCollectorMovementsOfflineMessage
            ::new);

    res.put(
        5792,
        () ->
            com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeSellOkMessage
                .i);

    res.put(
        6463, com.ankamagames.dofus.network.messages.game.ui.ClientUIOpenedByObjectMessage::new);

    res.put(
        6621,
        () ->
            com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag
                .CloseHavenBagFurnitureSequenceRequestMessage.i);

    res.put(
        6468,
        com.ankamagames.dofus.network.messages.game.prism.PrismSetSabotagedRequestMessage::new);

    res.put(
        6226,
        com.ankamagames.dofus.network.messages.game.shortcut.ShortcutBarSwapErrorMessage::new);

    res.put(6669, com.ankamagames.dofus.network.messages.common.basic.AggregateStatMessage::new);

    res.put(6584, com.ankamagames.dofus.network.messages.game.idol.IdolSelectErrorMessage::new);

    res.put(
        5765,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeTypesExchangerDescriptionForUserMessage
            ::new);

    res.put(
        5602,
        com.ankamagames.dofus.network.messages.game.friend.FriendSetWarnOnConnectionMessage::new);

    res.put(
        6171,
        com.ankamagames.dofus.network.messages.game.inventory.preset.InventoryPresetUpdateMessage
            ::new);

    res.put(
        6168,
        com.ankamagames.dofus.network.messages.game.inventory.preset
                .InventoryPresetItemUpdateMessage
            ::new);

    res.put(
        6073,
        com.ankamagames.dofus.network.messages.game.context.roleplay.fight
                .GameRolePlayAggressionMessage
            ::new);

    res.put(
        6162,
        com.ankamagames.dofus.network.messages.game.inventory.items.InventoryContentAndPresetMessage
            ::new);

    res.put(
        6004,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeObjectUseInWorkshopMessage
            ::new);

    res.put(
        251,
        com.ankamagames.dofus.network.messages.game.context.GameContextRemoveElementMessage::new);

    res.put(
        6550,
        com.ankamagames.dofus.network.messages.game.character.choice
                .CharactersListWithRemodelingMessage
            ::new);

    res.put(
        6312,
        com.ankamagames.dofus.network.messages.game.actions.fight
                .GameActionFightLifePointsLostMessage
            ::new);

    res.put(
        6724,
        com.ankamagames.dofus.network.messages.game.context.roleplay.quest
                .FollowQuestObjectiveRequestMessage
            ::new);

    res.put(
        6705,
        com.ankamagames.dofus.network.messages.game.context.roleplay.spell
                .SpellVariantActivationMessage
            ::new);

    res.put(
        6256,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .PartyInvitationCancelledForGuestMessage
            ::new);

    res.put(
        1301, com.ankamagames.dofus.network.messages.game.startup.StartupActionsListMessage::new);

    res.put(
        5542,
        com.ankamagames.dofus.network.messages.game.subscriber.SubscriptionLimitationMessage::new);

    res.put(
        6526,
        com.ankamagames.dofus.network.messages.game.inventory.items.SymbioticObjectErrorMessage
            ::new);

    res.put(
        6118,
        com.ankamagames.dofus.network.messages.game.actions.fight
                .AbstractGameActionFightTargetedAbilityMessage
            ::new);

    res.put(
        6011,
        com.ankamagames.dofus.network.messages.game.context.roleplay.spell.SpellItemBoostMessage
            ::new);

    res.put(
        6722,
        com.ankamagames.dofus.network.messages.game.context.roleplay.quest
                .RefreshFollowedQuestsOrderRequestMessage
            ::new);

    res.put(180, com.ankamagames.dofus.network.messages.game.basic.BasicWhoIsMessage::new);

    res.put(
        5917,
        com.ankamagames.dofus.network.messages.game.guild.tax.TaxCollectorMovementAddMessage::new);

    res.put(
        6523,
        com.ankamagames.dofus.network.messages.game.inventory.items.WrapperObjectAssociatedMessage
            ::new);

    res.put(
        5545,
        () ->
            com.ankamagames.dofus.network.messages.game.character.choice.CharactersListErrorMessage
                .i);

    res.put(5923, com.ankamagames.dofus.network.messages.game.guild.GuildMemberLeavingMessage::new);

    res.put(6372, com.ankamagames.dofus.network.messages.security.CheckIntegrityMessage::new);

    res.put(
        6072,
        () ->
            com.ankamagames.dofus.network.messages.game.character.choice
                .CharacterSelectedForceReadyMessage.i);

    res.put(
        6376,
        com.ankamagames.dofus.network.messages.game.achievement.AchievementRewardSuccessMessage
            ::new);

    res.put(
        5918,
        com.ankamagames.dofus.network.messages.game.guild.tax.TaxCollectorAttackedMessage::new);

    res.put(
        6080,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .PartyAbdicateThroneMessage
            ::new);

    res.put(
        700,
        com.ankamagames.dofus.network.messages.game.context.fight.GameFightStartingMessage::new);

    res.put(
        6008,
        com.ankamagames.dofus.network.messages.game.inventory.items
                .ExchangeObjectModifiedInBagMessage
            ::new);

    res.put(
        6575,
        com.ankamagames.dofus.network.messages.game.context.roleplay.fight.arena
                .GameRolePlayArenaSwitchToFightServerMessage
            ::new);

    res.put(
        1030,
        com.ankamagames.dofus.network.messages.game.actions.fight
                .GameActionFightPointsVariationMessage
            ::new);

    res.put(
        6120,
        com.ankamagames.dofus.network.messages.game.character.choice
                .CharactersListWithModificationsMessage
            ::new);

    res.put(
        6653,
        () ->
            com.ankamagames.dofus.network.messages.game.context.roleplay.spell
                .SpellModifyFailureMessage.i);

    res.put(
        1303,
        com.ankamagames.dofus.network.messages.game.startup.StartupActionsObjetAttributionMessage
            ::new);

    res.put(
        5999,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeCraftResultWithObjectDescMessage
            ::new);

    res.put(6443, com.ankamagames.dofus.network.messages.game.pvp.SetEnableAVARequestMessage::new);

    res.put(
        6730,
        com.ankamagames.dofus.network.messages.game.chat.community
                .ChatCommunityChannelCommunityMessage
            ::new);

    res.put(
        6026,
        com.ankamagames.dofus.network.messages.game.context.roleplay.paddock
                .GameDataPlayFarmObjectAnimationMessage
            ::new);

    res.put(
        6365, com.ankamagames.dofus.network.messages.game.tinsel.TitleSelectRequestMessage::new);

    res.put(
        6013,
        com.ankamagames.dofus.network.messages.game.atlas.compass.CompassUpdatePvpSeekMessage::new);

    res.put(
        6196, com.ankamagames.dofus.network.messages.game.chat.smiley.MoodSmileyResultMessage::new);

    res.put(
        5641,
        () -> com.ankamagames.dofus.network.messages.connection.register.NicknameAcceptedMessage.i);

    res.put(
        6179,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.UpdateMountBoostMessage
            ::new);

    res.put(
        6217,
        com.ankamagames.dofus.network.messages.game.actions.fight.GameActionFightVanishMessage
            ::new);

    res.put(6649, com.ankamagames.dofus.network.messages.web.haapi.HaapiApiKeyMessage::new);

    res.put(
        6475,
        com.ankamagames.dofus.network.messages.game.character.choice.BasicCharactersListMessage
            ::new);

    res.put(
        6192,
        com.ankamagames.dofus.network.messages.game.chat.smiley.MoodSmileyRequestMessage::new);

    res.put(
        6646,
        com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag.meeting
                .TeleportHavenBagAnswerMessage
            ::new);

    res.put(
        6386,
        com.ankamagames.dofus.network.messages.game.character.status.PlayerStatusUpdateMessage
            ::new);

    res.put(
        6289,
        com.ankamagames.dofus.network.messages.game.interactive.meeting.TeleportBuddiesMessage
            ::new);

    res.put(
        6034,
        com.ankamagames.dofus.network.messages.game.inventory.items.ObjectsDeletedMessage::new);

    res.put(
        821, com.ankamagames.dofus.network.messages.game.chat.report.ChatMessageReportMessage::new);

    res.put(6678, com.ankamagames.dofus.network.messages.game.dare.DareRewardWonMessage::new);

    res.put(
        5784,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangePlayerMultiCraftRequestMessage
            ::new);

    res.put(6292, com.ankamagames.dofus.network.messages.web.ankabox.NewMailMessage::new);

    res.put(
        5813,
        () ->
            com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeStartOkCraftMessage.i);

    res.put(
        713,
        com.ankamagames.dofus.network.messages.game.context.fight.GameFightTurnListMessage::new);

    res.put(
        5960,
        com.ankamagames.dofus.network.messages.game.interactive.zaap.TeleportDestinationsListMessage
            ::new);

    res.put(
        5819,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeStartOkJobIndexMessage
            ::new);

    res.put(
        6554,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeMountsTakenFromPaddockMessage
            ::new);

    res.put(
        153,
        com.ankamagames.dofus.network.messages.game.character.choice.CharacterSelectedSuccessMessage
            ::new);

    res.put(
        5822,
        com.ankamagames.dofus.network.messages.game.context.roleplay.fight
                .GameRolePlayFightRequestCanceledMessage
            ::new);

    res.put(
        5549,
        com.ankamagames.dofus.network.messages.game.guild.GuildChangeMemberParametersMessage::new);

    res.put(
        189, com.ankamagames.dofus.network.messages.server.basic.SystemMessageDisplayMessage::new);

    res.put(
        5719,
        com.ankamagames.dofus.network.messages.game.guild.tax.GuildFightPlayersHelpersLeaveMessage
            ::new);

    res.put(
        720, com.ankamagames.dofus.network.messages.game.context.fight.GameFightEndMessage::new);

    res.put(
        6262,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .PartyInvitationDungeonDetailsMessage
            ::new);

    res.put(861, com.ankamagames.dofus.network.messages.game.chat.ChatClientMultiMessage::new);

    res.put(
        5669,
        com.ankamagames.dofus.network.messages.game.context.roleplay.lockable
                .LockableStateUpdateStorageMessage
            ::new);

    res.put(
        6294,
        com.ankamagames.dofus.network.messages.game.interactive.meeting.TeleportBuddiesAnswerMessage
            ::new);

    res.put(
        3022, com.ankamagames.dofus.network.messages.game.inventory.items.ObjectDeleteMessage::new);

    res.put(
        6602,
        com.ankamagames.dofus.network.messages.game.inventory.preset.IdolsPresetDeleteMessage::new);

    res.put(40, com.ankamagames.dofus.network.messages.connection.ServerSelectionMessage::new);

    res.put(
        5830,
        com.ankamagames.dofus.network.messages.game.actions.fight
                .GameActionFightCarryCharacterMessage
            ::new);

    res.put(
        6532,
        com.ankamagames.dofus.network.messages.game.inventory.items.ExchangeObjectsRemovedMessage
            ::new);

    res.put(6366, com.ankamagames.dofus.network.messages.game.tinsel.TitleSelectedMessage::new);

    res.put(
        5643,
        com.ankamagames.dofus.network.messages.game.context.roleplay.quest.QuestStartRequestMessage
            ::new);

    res.put(
        6158, com.ankamagames.dofus.network.messages.game.context.ShowCellSpectatorMessage::new);

    res.put(
        5518,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeObjectMoveMessage
            ::new);

    res.put(
        6637,
        com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag
                .HavenBagFurnituresRequestMessage
            ::new);

    res.put(
        5706,
        com.ankamagames.dofus.network.messages.game.guild.GuildCharacsUpgradeRequestMessage::new);

    res.put(
        6706, com.ankamagames.dofus.network.messages.game.shortcut.ShortcutBarReplacedMessage::new);

    res.put(
        6595,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeCraftCountModifiedMessage
            ::new);

    res.put(
        5516,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeObjectAddedMessage
            ::new);

    res.put(951, com.ankamagames.dofus.network.messages.game.context.GameMapMovementMessage::new);

    res.put(
        6620,
        com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag
                .HavenBagPackListMessage
            ::new);

    res.put(
        6215,
        com.ankamagames.dofus.network.messages.game.context.fight.GameFightResumeWithSlavesMessage
            ::new);

    res.put(
        5937,
        com.ankamagames.dofus.network.messages.game.context.roleplay.fight
                .GameRolePlayPlayerFightFriendlyRequestedMessage
            ::new);

    res.put(
        6370, com.ankamagames.dofus.network.messages.game.tinsel.OrnamentSelectErrorMessage::new);

    res.put(
        745,
        () ->
            com.ankamagames.dofus.network.messages.game.context.roleplay.death
                .GameRolePlayFreeSoulRequestMessage.i);

    res.put(
        5554, com.ankamagames.dofus.network.messages.game.guild.GuildCreationResultMessage::new);

    res.put(
        5759,
        () ->
            com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeBuyOkMessage.i);

    res.put(6679, com.ankamagames.dofus.network.messages.game.dare.DareCanceledMessage::new);

    res.put(
        5666,
        com.ankamagames.dofus.network.messages.game.context.roleplay.lockable
                .LockableChangeCodeMessage
            ::new);

    res.put(
        5956, com.ankamagames.dofus.network.messages.game.atlas.AtlasPointInformationsMessage::new);

    res.put(
        800, com.ankamagames.dofus.network.messages.game.chat.smiley.ChatSmileyRequestMessage::new);

    res.put(
        6541,
        com.ankamagames.dofus.network.messages.game.context.fight
                .GameFightPlacementSwapPositionsRequestMessage
            ::new);

    res.put(
        6582,
        com.ankamagames.dofus.network.messages.game.idol.IdolPartyRegisterRequestMessage::new);

    res.put(
        6181,
        com.ankamagames.dofus.network.messages.game.guild.GuildHouseUpdateInformationMessage::new);

    res.put(
        5667,
        com.ankamagames.dofus.network.messages.game.context.roleplay.lockable.LockableUseCodeMessage
            ::new);

    res.put(
        5927,
        com.ankamagames.dofus.network.messages.game.context.fight.GameFightOptionStateUpdateMessage
            ::new);

    res.put(
        6389,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeSetCraftRecipeMessage
            ::new);

    res.put(
        6600,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeStartOkRecycleTradeMessage
            ::new);

    res.put(6362, com.ankamagames.dofus.network.messages.game.basic.BasicAckMessage::new);

    res.put(
        5898,
        com.ankamagames.dofus.network.messages.game.context.roleplay.npc
                .NpcGenericActionRequestMessage
            ::new);

    res.put(
        6324,
        com.ankamagames.dofus.network.messages.game.guild.GuildModificationStartedMessage::new);

    res.put(
        6716,
        com.ankamagames.dofus.network.messages.game.context.roleplay
                .MapFightStartPositionsUpdateMessage
            ::new);

    res.put(
        6444,
        com.ankamagames.dofus.network.messages.game.alliance.AllianceModificationStartedMessage
            ::new);

    res.put(
        6185,
        com.ankamagames.dofus.network.messages.game.chat.smiley.LocalizedChatSmileyMessage::new);

    res.put(
        946,
        com.ankamagames.dofus.network.messages.game.context.GameMapChangeOrientationMessage::new);

    res.put(
        6393,
        com.ankamagames.dofus.network.messages.game.alliance.AllianceCreationValidMessage::new);

    res.put(6340, com.ankamagames.dofus.network.messages.game.approach.ServerSettingsMessage::new);

    res.put(
        6270,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party.PartyLoyaltyStatusMessage
            ::new);

    res.put(
        6042, () -> com.ankamagames.dofus.network.messages.game.prism.PrismAttackRequestMessage.i);

    res.put(
        6244,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .PartyInvitationDungeonMessage
            ::new);

    res.put(
        5501, () -> com.ankamagames.dofus.network.messages.game.dialog.LeaveDialogRequestMessage.i);

    res.put(
        5958,
        com.ankamagames.dofus.network.messages.game.context.mount.PaddockRemoveItemRequestMessage
            ::new);

    res.put(
        6483,
        com.ankamagames
                .dofus
                .network
                .messages
                .game
                .context
                .roleplay
                .treasureHunt
                .TreasureHuntFinishedMessage
            ::new);

    res.put(
        6616, com.ankamagames.dofus.network.messages.subscription.SubscriptionUpdateMessage::new);

    res.put(1513, com.ankamagames.dofus.network.messages.updater.parts.DownloadErrorMessage::new);

    res.put(
        6704, com.ankamagames.dofus.network.messages.game.finishmoves.FinishMoveListMessage::new);

    res.put(
        5794,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeCraftInformationObjectMessage
            ::new);

    res.put(
        5646,
        com.ankamagames.dofus.network.messages.game.inventory.storage.StorageInventoryContentMessage
            ::new);

    res.put(182, com.ankamagames.dofus.network.messages.common.basic.BasicPingMessage::new);

    res.put(101, () -> com.ankamagames.dofus.network.messages.game.approach.HelloGameMessage.i);

    res.put(
        6392,
        com.ankamagames.dofus.network.messages.game.alliance.AllianceInvitationStateRecrutedMessage
            ::new);

    res.put(
        5984,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeStartedMountStockMessage
            ::new);

    res.put(
        5742,
        () ->
            com.ankamagames.dofus.network.messages.game.context.roleplay
                .MapRunningFightListRequestMessage.i);

    res.put(
        5723,
        com.ankamagames.dofus.network.messages.game.inventory.items.LivingObjectDissociateMessage
            ::new);

    res.put(
        6522,
        com.ankamagames.dofus.network.messages.game.inventory.items
                .SymbioticObjectAssociateRequestMessage
            ::new);

    res.put(
        6659, com.ankamagames.dofus.network.messages.game.dare.DareInformationsRequestMessage::new);

    res.put(
        6394,
        () ->
            com.ankamagames.dofus.network.messages.game.alliance.AllianceCreationStartedMessage.i);

    res.put(
        6224, com.ankamagames.dofus.network.messages.game.shortcut.ShortcutBarRemovedMessage::new);

    res.put(
        250,
        () ->
            com.ankamagames.dofus.network.messages.game.context.GameContextCreateRequestMessage.i);

    res.put(6253, com.ankamagames.dofus.network.messages.security.RawDataMessage::new);

    res.put(
        5572,
        com.ankamagames.dofus.network.messages.game.context.fight.GameFightUpdateTeamMessage::new);

    res.put(
        6513, com.ankamagames.dofus.network.messages.game.friend.WarnOnPermaDeathStateMessage::new);

    res.put(
        6137,
        com.ankamagames.dofus.network.messages.game.context.roleplay.houses.HouseToSellFilterMessage
            ::new);

    res.put(
        5897,
        com.ankamagames.dofus.network.messages.game.prism.PrismFightAttackerRemoveMessage::new);

    res.put(
        5972,
        com.ankamagames.dofus.network.messages.game.context.mount.MountInformationRequestMessage
            ::new);

    res.put(
        6540,
        () -> com.ankamagames.dofus.network.messages.game.approach.ReloginTokenRequestMessage.i);

    res.put(
        6276,
        com.ankamagames.dofus.network.messages.game.context.roleplay.fight.arena
                .GameRolePlayArenaFightPropositionMessage
            ::new);

    res.put(
        6546,
        com.ankamagames.dofus.network.messages.game.context.fight
                .GameFightPlacementSwapPositionsCancelledMessage
            ::new);

    res.put(
        6461,
        com.ankamagames.dofus.network.messages.game.inventory.items.MimicryObjectErrorMessage::new);

    res.put(
        6290, com.ankamagames.dofus.network.messages.game.inventory.items.ObjectFeedMessage::new);

    res.put(
        6639,
        com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag
                .ChangeThemeRequestMessage
            ::new);

    res.put(
        5993,
        com.ankamagames.dofus.network.messages.game.context.mount.GameDataPaddockObjectRemoveMessage
            ::new);

    res.put(
        6096,
        com.ankamagames.dofus.network.messages.game.context.roleplay.quest.QuestStepStartedMessage
            ::new);

    res.put(
        6691, com.ankamagames.dofus.network.messages.game.guild.GuildBulletinSetErrorMessage::new);

    res.put(
        5575,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party.PartyUpdateMessage::new);

    res.put(6373, com.ankamagames.dofus.network.messages.game.tinsel.TitleSelectErrorMessage::new);

    res.put(
        6272,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeBidHouseBuyResultMessage
            ::new);

    res.put(6451, com.ankamagames.dofus.network.messages.game.prism.PrismsInfoValidMessage::new);

    res.put(
        6329,
        com.ankamagames.dofus.network.messages.game.inventory.preset
                .InventoryPresetSaveCustomMessage
            ::new);

    res.put(5546, com.ankamagames.dofus.network.messages.game.guild.GuildCreationValidMessage::new);

    res.put(
        300,
        com.ankamagames.dofus.network.messages.game.context.roleplay.fight
                .GameRolePlayRemoveChallengeMessage
            ::new);

    res.put(6682, com.ankamagames.dofus.network.messages.game.dare.DareWonListMessage::new);

    res.put(6297, com.ankamagames.dofus.network.messages.game.basic.NumericWhoIsMessage::new);

    res.put(
        5954,
        com.ankamagames.dofus.network.messages.game.guild.tax
                .GameRolePlayTaxCollectorFightRequestMessage
            ::new);

    res.put(5835, com.ankamagames.dofus.network.messages.game.guild.GuildMembershipMessage::new);

    res.put(
        6701,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.FocusedExchangeReadyMessage
            ::new);

    res.put(6058, com.ankamagames.dofus.network.messages.game.pvp.AlignmentRankUpdateMessage::new);

    res.put(
        6264,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .PartyInvitationDetailsRequestMessage
            ::new);

    res.put(
        6139,
        com.ankamagames.dofus.network.messages.game.context.roleplay.houses
                .HouseToSellListRequestMessage
            ::new);

    res.put(
        6737,
        com.ankamagames.dofus.network.messages.game.context.roleplay.npc.PortalDialogCreationMessage
            ::new);

    res.put(
        6416,
        com.ankamagames.dofus.network.messages.game.context
                .GameContextRemoveMultipleElementsWithEventsMessage
            ::new);

    res.put(
        6684, com.ankamagames.dofus.network.messages.game.social.SocialNoticeSetErrorMessage::new);

    res.put(
        1511,
        com.ankamagames.dofus.network.messages.updater.parts.DownloadCurrentSpeedMessage::new);

    res.put(
        6268,
        com.ankamagames.dofus.network.messages.game.context.roleplay
                .MapComplementaryInformationsWithCoordsMessage
            ::new);

    res.put(
        5617,
        com.ankamagames.dofus.network.messages.game.context.roleplay.npc.NpcDialogQuestionMessage
            ::new);

    res.put(
        6613,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeOfflineSoldItemsMessage
            ::new);

    res.put(
        6426,
        com.ankamagames.dofus.network.messages.game.alliance.AllianceChangeGuildRightsMessage::new);

    res.put(
        5704,
        com.ankamagames.dofus.network.messages.game.context.roleplay.houses.guild
                .HouseGuildShareRequestMessage
            ::new);

    res.put(
        1512,
        com.ankamagames.dofus.network.messages.updater.parts.DownloadSetSpeedRequestMessage::new);

    res.put(
        6601,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.RecycleResultMessage::new);

    res.put(
        6277,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .PartyModifiableStatusMessage
            ::new);

    res.put(
        6236,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeStartedWithStorageMessage
            ::new);

    res.put(
        5951,
        com.ankamagames.dofus.network.messages.game.context.mount.PaddockBuyRequestMessage::new);

    res.put(5600, com.ankamagames.dofus.network.messages.game.friend.FriendAddFailureMessage::new);

    res.put(
        6466,
        com.ankamagames.dofus.network.messages.game.prism.PrismSetSabotagedRefusedMessage::new);

    res.put(
        6210,
        com.ankamagames.dofus.network.messages.game.inventory.preset
                .InventoryPresetItemUpdateRequestMessage
            ::new);

    res.put(
        6320,
        com.ankamagames.dofus.network.messages.game.actions.fight
                .GameActionFightInvisibleDetectedMessage
            ::new);

    res.put(
        6218,
        com.ankamagames.dofus.network.messages.game.context.fight.character
                .GameFightShowFighterRandomStaticPoseMessage
            ::new);

    res.put(
        6502,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party.PartyNameUpdateMessage
            ::new);

    res.put(6275, com.ankamagames.dofus.network.messages.web.ankabox.MailStatusMessage::new);

    res.put(
        6527,
        com.ankamagames.dofus.network.messages.game.inventory.items.SymbioticObjectAssociatedMessage
            ::new);

    res.put(6081, com.ankamagames.dofus.network.messages.game.context.GameContextKickMessage::new);

    res.put(
        6434,
        com.ankamagames.dofus.network.messages.game.approach.ServerSessionConstantsMessage::new);

    res.put(
        6130,
        com.ankamagames.dofus.network.messages.game.context.roleplay
                .MapComplementaryInformationsDataInHouseMessage
            ::new);

    res.put(5552, com.ankamagames.dofus.network.messages.game.guild.GuildInvitedMessage::new);

    res.put(
        5619,
        com.ankamagames.dofus.network.messages.game.context.roleplay.npc
                .TaxCollectorDialogQuestionBasicMessage
            ::new);

    res.put(50, com.ankamagames.dofus.network.messages.connection.ServerStatusUpdateMessage::new);

    res.put(
        6341,
        com.ankamagames.dofus.network.messages.game.almanach.AlmanachCalendarDateMessage::new);

    res.put(
        6375,
        com.ankamagames.dofus.network.messages.game.achievement.AchievementRewardErrorMessage::new);

    res.put(6695, com.ankamagames.dofus.network.messages.game.social.BulletinMessage::new);

    res.put(
        6019,
        com.ankamagames.dofus.network.messages.game.context.fight.challenge.ChallengeResultMessage
            ::new);

    res.put(
        255, () -> com.ankamagames.dofus.network.messages.game.context.GameContextQuitMessage.i);

    res.put(
        6321,
        com.ankamagames.dofus.network.messages.game.character.stats.CharacterExperienceGainMessage
            ::new);

    res.put(
        6261,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party.PartyDeletedMessage
            ::new);

    res.put(
        6647,
        com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag.meeting
                .TeleportHavenBagRequestMessage
            ::new);

    res.put(
        161,
        com.ankamagames.dofus.network.messages.game.character.creation
                .CharacterCreationResultMessage
            ::new);

    res.put(
        6328,
        com.ankamagames.dofus.network.messages.game.guild.GuildModificationEmblemValidMessage::new);

    res.put(
        5589,
        com.ankamagames.dofus.network.messages.game.atlas.compass.CompassUpdatePartyMemberMessage
            ::new);

    res.put(
        6598,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeCrafterJobLevelupMessage
            ::new);

    res.put(
        254,
        com.ankamagames.dofus.network.messages.game.context.GameContextMoveMultipleElementsMessage
            ::new);

    res.put(
        5638,
        com.ankamagames.dofus.network.messages.connection.register.NicknameRefusedMessage::new);

    res.put(
        5526,
        com.ankamagames.dofus.network.messages.game.actions.fight
                .GameActionFightReduceDamagesMessage
            ::new);

    res.put(
        6508,
        com.ankamagames
                .dofus
                .network
                .messages
                .game
                .context
                .roleplay
                .treasureHunt
                .TreasureHuntFlagRequestMessage
            ::new);

    res.put(
        5750,
        com.ankamagames.dofus.network.messages.game.context.roleplay
                .MapRunningFightDetailsRequestMessage
            ::new);

    res.put(
        6599,
        com.ankamagames.dofus.network.messages.game.context.roleplay.job
                .JobExperienceOtherPlayerUpdateMessage
            ::new);

    res.put(
        5935,
        com.ankamagames.dofus.network.messages.game.social.ContactLookRequestByIdMessage::new);

    res.put(
        6350,
        com.ankamagames.dofus.network.messages.web.krosmaster.KrosmasterInventoryMessage::new);

    res.put(179, com.ankamagames.dofus.network.messages.game.basic.BasicWhoIsNoMatchMessage::new);

    res.put(
        5981,
        () ->
            com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeMountStableErrorMessage.i);

    res.put(
        6339,
        com.ankamagames.dofus.network.messages.game.initialization.CharacterCapabilitiesMessage
            ::new);

    res.put(
        6172, com.ankamagames.dofus.network.messages.game.context.mount.MountDataErrorMessage::new);

    res.put(
        6044,
        com.ankamagames.dofus.network.messages.game.context.roleplay.job
                .JobCrafterDirectoryEntryMessage
            ::new);

    res.put(
        6559,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeMountsPaddockRemoveMessage
            ::new);

    res.put(6135, com.ankamagames.dofus.network.messages.game.chat.ChatAdminServerMessage::new);

    res.put(
        6622,
        com.ankamagames.dofus.network.messages.game.context.roleplay
                .MapComplementaryInformationsDataInHavenBagMessage
            ::new);

    res.put(
        3013,
        com.ankamagames.dofus.network.messages.game.inventory.items.ObjectUseOnCellMessage::new);

    res.put(
        6322,
        com.ankamagames.dofus.network.messages.game.character.stats.FighterStatsListMessage::new);

    res.put(
        862,
        com.ankamagames.dofus.network.messages.game.chat.ChatClientMultiWithObjectMessage::new);

    res.put(
        6496,
        com.ankamagames.dofus.network.messages.game.context.GameCautiousMapMovementRequestMessage
            ::new);

    res.put(
        5949,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeBidHouseInListAddedMessage
            ::new);

    res.put(
        3014,
        com.ankamagames.dofus.network.messages.game.context.roleplay.objects
                .ObjectGroundRemovedMessage
            ::new);

    res.put(
        6303,
        com.ankamagames.dofus.network.messages.game.interactive.meeting.TeleportToBuddyCloseMessage
            ::new);

    res.put(
        6035,
        com.ankamagames.dofus.network.messages.game.inventory.storage.StorageObjectsRemoveMessage
            ::new);

    res.put(
        6245,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .PartyInvitationDungeonRequestMessage
            ::new);

    res.put(6156, com.ankamagames.dofus.network.messages.security.CheckFileMessage::new);

    res.put(
        6116,
        com.ankamagames.dofus.network.messages.game.actions.fight.GameActionFightCloseCombatMessage
            ::new);

    res.put(
        5843,
        com.ankamagames.dofus.network.messages.game.prism.PrismFightJoinLeaveRequestMessage::new);

    res.put(
        5753,
        () ->
            com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeRequestOnShopStockMessage.i);

    res.put(
        956, com.ankamagames.dofus.network.messages.game.actions.sequence.SequenceEndMessage::new);

    res.put(
        6489,
        com.ankamagames
                .dofus
                .network
                .messages
                .game
                .context
                .roleplay
                .treasureHunt
                .TreasureHuntRequestAnswerMessage
            ::new);

    res.put(
        5761,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeStartOkNpcShopMessage
            ::new);

    res.put(
        6048,
        com.ankamagames.dofus.network.messages.game.context.roleplay.TeleportOnSameMapMessage::new);

    res.put(6648, com.ankamagames.dofus.network.messages.web.haapi.HaapiApiKeyRequestMessage::new);

    res.put(5664, com.ankamagames.dofus.network.messages.game.basic.BasicWhoAmIRequestMessage::new);

    res.put(
        170,
        com.ankamagames.dofus.network.messages.game.initialization.SetCharacterRestrictionsMessage
            ::new);

    res.put(
        5558,
        com.ankamagames.dofus.network.messages.game.guild.GuildInformationsMembersMessage::new);

    res.put(
        6000,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeCraftResultWithObjectIdMessage
            ::new);

    res.put(
        6549,
        com.ankamagames.dofus.network.messages.game.character.choice
                .CharacterSelectionWithRemodelMessage
            ::new);

    res.put(
        6356, com.ankamagames.dofus.network.messages.game.friend.SpouseInformationsMessage::new);

    res.put(
        5606,
        com.ankamagames.dofus.network.messages.game.friend
                .FriendSpouseFollowWithCompassRequestMessage
            ::new);

    res.put(
        5680, com.ankamagames.dofus.network.messages.game.friend.IgnoredDeleteRequestMessage::new);

    res.put(
        5523,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeRequestedTradeMessage
            ::new);

    res.put(
        6175,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party.PartyRestrictedMessage
            ::new);

    res.put(
        6471,
        () ->
            com.ankamagames.dofus.network.messages.game.initialization
                .CharacterLoadingCompleteMessage.i);

    res.put(4, com.ankamagames.dofus.network.messages.connection.IdentificationMessage::new);

    res.put(5562, () -> com.ankamagames.dofus.network.messages.game.guild.GuildLeftMessage.i);

    res.put(
        6490,
        com.ankamagames.dofus.network.messages.game.context.fight.GameFightNewWaveMessage::new);

    res.put(
        6088,
        () ->
            com.ankamagames.dofus.network.messages.game.context.roleplay.quest
                .GuidedModeReturnRequestMessage.i);

    res.put(
        6077,
        com.ankamagames.dofus.network.messages.game.friend.FriendSetWarnOnLevelGainMessage::new);

    res.put(
        6155,
        com.ankamagames.dofus.network.messages.game.context.GameMapChangeOrientationsMessage::new);

    res.put(
        5625,
        com.ankamagames.dofus.network.messages.game.context.roleplay.quest.QuestStepInfoMessage
            ::new);

    res.put(
        5950,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeBidHouseInListRemovedMessage
            ::new);

    res.put(
        3021,
        com.ankamagames.dofus.network.messages.game.inventory.items.ObjectSetPositionMessage::new);

    res.put(
        5581,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .PartyFollowStatusUpdateMessage
            ::new);

    res.put(
        5623,
        () ->
            com.ankamagames.dofus.network.messages.game.context.roleplay.quest
                .QuestListRequestMessage.i);

    res.put(882, com.ankamagames.dofus.network.messages.game.chat.ChatServerCopyMessage::new);

    res.put(
        6729,
        com.ankamagames.dofus.network.messages.game.chat.community
                .ChatCommunityChannelSetCommunityRequestMessage
            ::new);

    res.put(
        5901, com.ankamagames.dofus.network.messages.game.prism.PrismFightSwapRequestMessage::new);

    res.put(
        1304,
        com.ankamagames.dofus.network.messages.game.startup.StartupActionFinishedMessage::new);

    res.put(
        5622,
        com.ankamagames.dofus.network.messages.game.context.roleplay.quest
                .QuestStepInfoRequestMessage
            ::new);

    res.put(
        5790,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeCraftResultMessage
            ::new);

    res.put(
        702, com.ankamagames.dofus.network.messages.game.context.fight.GameFightJoinMessage::new);

    res.put(6364, com.ankamagames.dofus.network.messages.game.tinsel.TitleGainedMessage::new);

    res.put(
        5703,
        com.ankamagames.dofus.network.messages.game.context.roleplay.houses.guild
                .HouseGuildRightsMessage
            ::new);

    res.put(
        6282,
        () ->
            com.ankamagames.dofus.network.messages.game.context.roleplay.fight.arena
                .GameRolePlayArenaUnregisterMessage.i);

    res.put(
        6579,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeCraftPaymentModificationRequestMessage
            ::new);

    res.put(
        6388, com.ankamagames.dofus.network.messages.game.chat.smiley.MoodSmileyUpdateMessage::new);

    res.put(
        6335,
        com.ankamagames.dofus.network.messages.game.inventory.ObjectAveragePricesMessage::new);

    res.put(
        5592,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party.PartyKickRequestMessage
            ::new);

    res.put(
        5514,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeObjectMovePricedMessage
            ::new);

    res.put(
        5807,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeBidHouseListMessage
            ::new);

    res.put(
        6293,
        com.ankamagames.dofus.network.messages.game.interactive.meeting.TeleportToBuddyAnswerMessage
            ::new);

    res.put(
        5649,
        com.ankamagames.dofus.network.messages.game.context.roleplay.job
                .JobCrafterDirectoryDefineSettingsMessage
            ::new);

    res.put(
        6150,
        com.ankamagames.dofus.network.messages.game.context.roleplay.delay
                .GameRolePlayDelayedActionFinishedMessage
            ::new);

    res.put(
        1510,
        () ->
            com.ankamagames.dofus.network.messages.updater.parts
                .DownloadGetCurrentSpeedRequestMessage.i);

    res.put(
        5616,
        com.ankamagames.dofus.network.messages.game.context.roleplay.npc.NpcDialogReplyMessage
            ::new);

    res.put(6688, com.ankamagames.dofus.network.messages.game.social.SocialNoticeMessage::new);

    res.put(
        6615,
        com.ankamagames.dofus.network.messages.game.inventory.preset.IdolsPresetUseMessage::new);

    res.put(
        5530,
        com.ankamagames.dofus.network.messages.game.actions.fight
                .GameActionFightReflectDamagesMessage
            ::new);

    res.put(
        6569,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.DecraftResultMessage::new);

    res.put(
        6519, com.ankamagames.dofus.network.messages.game.inventory.items.ObtainedItemMessage::new);

    res.put(
        6586,
        com.ankamagames.dofus.network.messages.game.idol.IdolFightPreparationUpdateMessage::new);

    res.put(6154, com.ankamagames.dofus.network.messages.security.CheckFileRequestMessage::new);

    res.put(
        6521, com.ankamagames.dofus.network.messages.game.look.AccessoryPreviewErrorMessage::new);

    res.put(
        1004,
        com.ankamagames.dofus.network.messages.game.actions.fight.GameActionFightTackledMessage
            ::new);

    res.put(
        6492,
        com.ankamagames
                .dofus
                .network
                .messages
                .game
                .context
                .roleplay
                .treasureHunt
                .PortalUseRequestMessage
            ::new);

    res.put(
        708, com.ankamagames.dofus.network.messages.game.context.fight.GameFightReadyMessage::new);

    res.put(
        5675,
        com.ankamagames.dofus.network.messages.game.context.roleplay.document
                .DocumentReadingBeginMessage
            ::new);

    res.put(
        5775,
        () ->
            com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeStartAsVendorMessage.i);

    res.put(
        6273,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party.AbstractPartyEventMessage
            ::new);

    res.put(
        210,
        com.ankamagames.dofus.network.messages.game.context.roleplay.MapFightCountMessage::new);

    res.put(
        6046,
        com.ankamagames.dofus.network.messages.game.context.roleplay.job
                .JobCrafterDirectoryListMessage
            ::new);

    res.put(6439, com.ankamagames.dofus.network.messages.game.alliance.KohUpdateMessage::new);

    res.put(6062, com.ankamagames.dofus.network.messages.game.guild.GuildLevelUpMessage::new);

    res.put(6681, com.ankamagames.dofus.network.messages.game.dare.DareWonMessage::new);

    res.put(
        950,
        com.ankamagames.dofus.network.messages.game.context.GameMapMovementRequestMessage::new);

    res.put(
        6069,
        com.ankamagames.dofus.network.messages.game.context.fight.GameFightSpectateMessage::new);

    res.put(
        5640,
        () ->
            com.ankamagames.dofus.network.messages.connection.register.NicknameRegistrationMessage
                .i);

    res.put(1501, () -> com.ankamagames.dofus.network.messages.updater.parts.GetPartsListMessage.i);

    res.put(
        5980,
        () ->
            com.ankamagames.dofus.network.messages.game.context.mount.MountReleaseRequestMessage.i);

    res.put(4004, com.ankamagames.dofus.network.messages.game.friend.FriendAddRequestMessage::new);

    res.put(
        6323, com.ankamagames.dofus.network.messages.game.guild.GuildModificationValidMessage::new);

    res.put(
        6280,
        com.ankamagames.dofus.network.messages.game.context.roleplay.fight.arena
                .GameRolePlayArenaRegisterMessage
            ::new);

    res.put(
        201, () -> com.ankamagames.dofus.network.messages.game.context.GameContextDestroyMessage.i);

    res.put(
        5563,
        com.ankamagames.dofus.network.messages.game.guild.GuildInvitationStateRecruterMessage::new);

    res.put(5663, com.ankamagames.dofus.network.messages.game.basic.BasicLatencyStatsMessage::new);

    res.put(
        5900,
        () ->
            com.ankamagames.dofus.network.messages.game.context.roleplay.npc
                .NpcGenericActionFailureMessage.i);

    res.put(
        5528,
        com.ankamagames.dofus.network.messages.game.actions.fight
                .GameActionFightTeleportOnSameMapMessage
            ::new);

    res.put(
        6129,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeStartedWithPodsMessage
            ::new);

    res.put(
        253,
        com.ankamagames.dofus.network.messages.game.context.GameContextMoveElementMessage::new);

    res.put(
        6547,
        com.ankamagames.dofus.network.messages.game.context.fight
                .GameFightPlacementSwapPositionsAcceptMessage
            ::new);

    res.put(
        6054,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party.PartyUpdateLightMessage
            ::new);

    res.put(6369, com.ankamagames.dofus.network.messages.game.tinsel.OrnamentSelectedMessage::new);

    res.put(183, com.ankamagames.dofus.network.messages.common.basic.BasicPongMessage::new);

    res.put(
        5632,
        com.ankamagames.dofus.network.messages.game.context.roleplay.GameRolePlayShowActorMessage
            ::new);

    res.put(5859, com.ankamagames.dofus.network.messages.game.prism.PrismInfoInValidMessage::new);

    res.put(6267, com.ankamagames.dofus.network.messages.secure.TrustStatusMessage::new);

    res.put(
        21,
        com.ankamagames.dofus.network.messages.connection.IdentificationFailedForBadVersionMessage
            ::new);

    res.put(
        5586,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party.PartyInvitationMessage
            ::new);

    res.put(6505, com.ankamagames.dofus.network.messages.game.guest.GuestModeMessage::new);

    res.put(
        3017,
        com.ankamagames.dofus.network.messages.game.context.roleplay.objects
                .ObjectGroundAddedMessage
            ::new);

    res.put(
        6287,
        com.ankamagames.dofus.network.messages.game.interactive.meeting.TeleportToBuddyOfferMessage
            ::new);

    res.put(
        5590,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party.PartyKickedByMessage
            ::new);

    res.put(5612, com.ankamagames.dofus.network.messages.game.context.ShowCellMessage::new);

    res.put(
        5885,
        com.ankamagames.dofus.network.messages.game.context.roleplay.houses
                .HouseLockFromInsideRequestMessage
            ::new);

    res.put(177, com.ankamagames.dofus.network.messages.game.basic.BasicDateMessage::new);

    res.put(
        5991,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeStartOkMountWithOutPaddockMessage
            ::new);

    res.put(6071, com.ankamagames.dofus.network.messages.game.context.GameContextReadyMessage::new);

    res.put(1, com.ankamagames.dofus.network.messages.handshake.ProtocolRequired::new);

    res.put(6594, com.ankamagames.dofus.network.messages.wtf.ClientYouAreDrunkMessage::new);

    res.put(6266, com.ankamagames.dofus.network.messages.game.script.URLOpenMessage::new);

    res.put(
        6700,
        com.ankamagames.dofus.network.messages.game.context.fight.arena.ArenaFighterLeaveMessage
            ::new);

    res.put(5537, com.ankamagames.dofus.network.messages.game.inventory.KamasUpdateMessage::new);

    res.put(
        6568,
        com.ankamagames.dofus.network.messages.game.guild.tax.AbstractTaxCollectorListMessage::new);

    res.put(
        5634, com.ankamagames.dofus.network.messages.game.guild.tax.TaxCollectorErrorMessage::new);

    res.put(
        6503,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .PartyNameSetRequestMessage
            ::new);

    res.put(
        6103,
        com.ankamagames.dofus.network.messages.game.context.notification.NotificationByServerMessage
            ::new);

    res.put(
        5511,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeReadyMessage::new);

    res.put(
        5755,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeBidPriceMessage
            ::new);

    res.put(
        5642,
        com.ankamagames.dofus.network.messages.game.context.roleplay.npc
                .MapNpcsQuestStatusUpdateMessage
            ::new);

    res.put(
        6573, com.ankamagames.dofus.network.messages.common.basic.BasicStatWithDataMessage::new);

    res.put(2, () -> com.ankamagames.dofus.network.messages.common.NetworkDataContainerMessage.i);

    res.put(
        6614,
        com.ankamagames.dofus.network.messages.game.inventory.preset.IdolsPresetUseResultMessage
            ::new);

    res.put(
        5786,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges.ExchangeWaitingResultMessage
            ::new);

    res.put(
        6427, com.ankamagames.dofus.network.messages.game.alliance.AlliancePartialListMessage::new);

    res.put(
        6055,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeMountFreeFromPaddockMessage
            ::new);

    res.put(
        5637,
        com.ankamagames.dofus.network.messages.game.context.GameContextRefreshEntityLookMessage
            ::new);

    res.put(6517, com.ankamagames.dofus.network.messages.game.look.AccessoryPreviewMessage::new);

    res.put(
        5716, com.ankamagames.dofus.network.messages.game.interactive.StatedMapUpdateMessage::new);

    res.put(
        3004, com.ankamagames.dofus.network.messages.game.inventory.items.ObjectErrorMessage::new);

    res.put(6079, com.ankamagames.dofus.network.messages.game.report.CharacterReportMessage::new);

    res.put(
        6160,
        com.ankamagames.dofus.network.messages.game.friend.GuildMemberWarnOnConnectionStateMessage
            ::new);

    res.put(
        6642,
        com.ankamagames.dofus.network.messages.game.context.roleplay.havenbag.meeting
                .InviteInHavenBagMessage
            ::new);

    res.put(
        220, com.ankamagames.dofus.network.messages.game.context.roleplay.CurrentMapMessage::new);

    res.put(
        5570,
        com.ankamagames.dofus.network.messages.game.actions.fight.GameActionFightUnmarkCellsMessage
            ::new);

    res.put(
        5733,
        com.ankamagames.dofus.network.messages.game.context.roleplay.fight
                .GameRolePlayPlayerFightFriendlyAnsweredMessage
            ::new);

    res.put(
        6110,
        com.ankamagames.dofus.network.messages.game.context.roleplay.npc.EntityTalkMessage::new);

    res.put(
        5578,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party.PartyLeaderUpdateMessage
            ::new);

    res.put(
        160,
        com.ankamagames.dofus.network.messages.game.character.creation
                .CharacterCreationRequestMessage
            ::new);

    res.put(
        6486,
        com.ankamagames
                .dofus
                .network
                .messages
                .game
                .context
                .roleplay
                .treasureHunt
                .TreasureHuntMessage
            ::new);

    res.put(
        5953,
        com.ankamagames.dofus.network.messages.game.context.mount.PaddockSellRequestMessage::new);

    res.put(
        5864,
        com.ankamagames.dofus.network.messages.game.context.fight.character
                .GameFightShowFighterMessage
            ::new);

    res.put(6397, com.ankamagames.dofus.network.messages.game.alliance.AllianceInvitedMessage::new);

    res.put(
        6693,
        com.ankamagames.dofus.network.messages.game.alliance.AllianceBulletinSetRequestMessage
            ::new);

    res.put(
        6009,
        com.ankamagames.dofus.network.messages.game.inventory.items.ExchangeObjectPutInBagMessage
            ::new);

    res.put(
        6593,
        com.ankamagames.dofus.network.messages.game.context.roleplay.job.JobBookSubscriptionMessage
            ::new);

    res.put(
        6173,
        com.ankamagames.dofus.network.messages.game.inventory.preset
                .InventoryPresetDeleteResultMessage
            ::new);

    res.put(
        6536,
        com.ankamagames.dofus.network.messages.game.context.roleplay.document
                .ComicReadingBeginMessage
            ::new);

    res.put(
        6509,
        com.ankamagames
                .dofus
                .network
                .messages
                .game
                .context
                .roleplay
                .treasureHunt
                .TreasureHuntDigRequestAnswerFailedMessage
            ::new);

    res.put(
        6183,
        com.ankamagames.dofus.network.messages.game.inventory.exchanges
                .ExchangeObjectTransfertListFromInvMessage
            ::new);

    res.put(
        5970, com.ankamagames.dofus.network.messages.game.context.mount.MountXpRatioMessage::new);

    res.put(
        6349,
        com.ankamagames.dofus.network.messages.web.krosmaster.KrosmasterTransferRequestMessage
            ::new);

    res.put(
        6603,
        com.ankamagames.dofus.network.messages.game.inventory.preset.IdolsPresetSaveMessage::new);

    res.put(
        6565,
        com.ankamagames.dofus.network.messages.game.guild.tax.TopTaxCollectorListMessage::new);

    res.put(
        6231, com.ankamagames.dofus.network.messages.game.shortcut.ShortcutBarContentMessage::new);

    res.put(
        6248,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .DungeonPartyFinderListenErrorMessage
            ::new);

    res.put(
        5671,
        com.ankamagames.dofus.network.messages.game.context.roleplay.lockable
                .LockableStateUpdateAbstractMessage
            ::new);

    res.put(
        6247,
        com.ankamagames.dofus.network.messages.game.context.roleplay.party
                .DungeonPartyFinderRoomContentMessage
            ::new);

    res.put(
        6334,
        () ->
            com.ankamagames.dofus.network.messages.game.inventory.ObjectAveragePricesGetMessage.i);

    return res;
  }
}
