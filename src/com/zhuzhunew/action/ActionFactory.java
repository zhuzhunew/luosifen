package com.zhuzhunew.action;

import com.zhuzhunew.behavior.MapRunningBehavior;
import com.zhuzhunew.type.MapLocation;
import com.zhuzhunew.type.Position;

import javax.swing.text.rtf.RTFEditorKit;
import java.awt.*;

/**
 * Created by 一帆 on 2017/3/22.
 */
public class ActionFactory {
    ActionContext actionContext;
    ClearWindowsAction clearWindowsAction;
    DestroyItemsAction destroyItemsAction;
    DropToClosetAction dropToClosetAction;
    EnterBossRoomAction enterBossRoomAction;
    EnterGameAction enterGameAction;
    LeaveGameAction leaveGameAction;
    GoToBlackSmithAction goToBlackSmithAction;
    GoToClosetAction goToClosetAction;
    InitFightAction initFightAction;
    MapTeleportAction mapTeleportAction;
    PickupLegendAction pickupLegendAction;
    RepairAction repairAction;
    StepFightAction stepFightAction;
    DeathAction deathAction;
    CheckBossRoomAction checkBossRoomAction;

    public ActionFactory(ActionContext actionContext) {
        this.actionContext = actionContext;
    }

    public ClearWindowsAction getClearWindowsAction() {
        return new ClearWindowsAction(actionContext);
    }

    public DestroyItemsAction getDestroyItemsAction() {
        return new DestroyItemsAction(actionContext);
    }

    public DropToClosetAction getDropToClosetAction() {
        return new DropToClosetAction(actionContext);
    }

    public EnterBossRoomAction getEnterBossRoomAction(MapLocation location) {
        return new EnterBossRoomAction(actionContext, location);
    }

    public EnterGameAction getEnterGameAction() {
        return new EnterGameAction(actionContext);
    }

    public LeaveGameAction getLeaveGameAction() {
        return new LeaveGameAction(actionContext);
    }

    public GoToBlackSmithAction getGoToBlackSmithAction(Position from) {
        return new GoToBlackSmithAction(actionContext, from);
    }

    public GoToClosetAction getGoToClosetAction() {
        return new GoToClosetAction(actionContext);
    }

    public InitFightAction getInitFightAction() {
        return new InitFightAction(actionContext);
    }

    public MapTeleportAction getMapTeleportAction(MapLocation location) {
        return new MapTeleportAction(actionContext, location);
    }

    public PickupLegendAction getPickupLegendAction(Rectangle rectangle, MapRunningBehavior.StopFlag stopFlag) {
        return new PickupLegendAction(actionContext, rectangle, stopFlag);
    }

    public RepairAction getRepairAction() {
        return new RepairAction(actionContext);
    }

    public StepFightAction getStepFightAction(int[] step) {
        if (stepFightAction == null) {
            stepFightAction = new StepFightAction(actionContext, step);
        } else{
            stepFightAction.setStep(step);
        }
        return stepFightAction;
    }

    public DeathAction getDeathAction(MapRunningBehavior.StopFlag stopFlag) {
        return new DeathAction(actionContext, stopFlag);
    }

    public CheckBossRoomAction getCheckBossRoomAction(MapRunningBehavior.StopFlag stopFlag) {
        return new CheckBossRoomAction(actionContext, stopFlag);
    }
}
