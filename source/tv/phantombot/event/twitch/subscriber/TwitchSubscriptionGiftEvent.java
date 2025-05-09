/*
 * Copyright (C) 2016-2024 phantombot.github.io/PhantomBot
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package tv.phantombot.event.twitch.subscriber;

import tv.phantombot.event.twitch.TwitchEvent;

public class TwitchSubscriptionGiftEvent extends TwitchEvent {

    private final String username;
    private final String recipient;
    private final String months;
    private final String plan;
    private final String giftedMonths;
    private final boolean fromBulk;

    /**
     * Class constructor.
     *
     * @param username
     * @param recipient
     * @param plan
     */
    public TwitchSubscriptionGiftEvent(String username, String recipient, String plan) {
        this.username = username;
        this.recipient = recipient;
        this.months = null;
        this.plan = plan;
        this.giftedMonths = null;
        this.fromBulk = false;
    }

    /**
     * Class constructor.
     *
     * @param username
     * @param recipient
     * @param months
     * @param plan
     */
    public TwitchSubscriptionGiftEvent(String username, String recipient, String months, String plan) {
        this.username = username;
        this.recipient = recipient;
        this.months = months;
        this.plan = plan;
        this.giftedMonths = null;
        this.fromBulk = false;
    }

    /**
     * Class constructor.
     *
     * @param username
     * @param recipient
     * @param months
     * @param plan
     * @param giftedMonths
     */
    public TwitchSubscriptionGiftEvent(String username, String recipient, String months, String plan, String giftedMonths) {
        this.username = username;
        this.recipient = recipient;
        this.months = months;
        this.plan = plan;
        this.giftedMonths = giftedMonths;
        this.fromBulk = false;
    }

    /**
     * Class constructor.
     *
     * @param username
     * @param recipient
     * @param months
     * @param plan
     * @param giftedMonths
     * @param fromBulk
     */
    public TwitchSubscriptionGiftEvent(String username, String recipient, String months, String plan, String giftedMonths, boolean fromBulk) {
        this.username = username;
        this.recipient = recipient;
        this.months = months;
        this.plan = plan;
        this.giftedMonths = giftedMonths;
        this.fromBulk = fromBulk;
    }

    /**
     * Method that returns the gifted the subscription.
     *
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Method that returns the recipient.
     *
     * @return recipient
     */
    public String getRecipient() {
        return this.recipient;
    }

    /**
     * Method that returns the months, can be 0.
     *
     * @return months
     */
    public String getMonths() {
        return (this.months == null) ? "1" : this.months;
    }

    /**
     * Method that returns the number of months gifted.
     *
     * @return months
     */
    public String getGiftedMonths() {
        return (this.giftedMonths == null) ? "1" : this.giftedMonths;
    }

    /**
     * Method that returns the subscription plan. (1000, 2000, 3000 and Prime)
     *
     * @return plan
     */
    public String getPlan() {
        return this.plan;
    }

    /**
     * Indicates if this gift subscription is likely from a bulk gift-sub event
     *
     * @return
     */
    public boolean fromBulk() {
        return this.fromBulk;
    }
}
