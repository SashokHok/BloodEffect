<div align="center">

# 🩸 BloodEffect

### Realistic Blood Effects for Minecraft Servers

<br>

<img src="https://img.shields.io/badge/Minecraft-1.12–1.21.x-brightgreen?style=for-the-badge">
<img src="https://img.shields.io/badge/Platform-Spigot%20%7C%20Paper-orange?style=for-the-badge">
<img src="https://img.shields.io/badge/Lightweight-Yes-success?style=for-the-badge">
<img src="https://img.shields.io/badge/Optimized-High-blue?style=for-the-badge">

<br><br>

⚔️ Add realistic blood effects to your server!  
Perfect for **PvP**, **RPG**, **DayZ**, and **Survival** modes.

<br>

<a href="https://www.spigotmc.org/resources/bloodeffect.126191/" target="_blank">
<img src="https://img.shields.io/badge/Download%20on-SpigotMC-orange?style=for-the-badge">
</a>

</div>

---

## ✨ Features

- 🩸 Realistic blood effects on damage  
- ⚔️ Enhances PvP immersion  
- 🧟 Perfect for RPG & DayZ servers  
- 🎯 Projectile support (arrows, snowballs, etc.)  
- 🔫 CrackShot integration  
- ⚙ Fully configurable  
- 🚀 Lightweight & optimized  
- 🔄 Reload without server restart  
- ✅ Compatible with Minecraft **1.12 – 1.21.x**

---

## 🎮 Commands

| Command | Description |
|----------|-------------|
| `/bloodeffect reload` | Reloads the plugin configuration |

---

## 🔐 Permissions

| Permission | Description |
|------------|-------------|
| `bloodeffect.admin` | Allows reloading the plugin |

---

## 📦 Installation

1. Download the latest version from SpigotMC  
2. Place the `.jar` file into your `/plugins` folder  
3. Restart your server  
4. Configure the plugin as needed  

---

## ⚙ Configuration

```yaml
Command:
  noPermission: "&cYou do not have permission to use this command."
  pluginConfigReloaded: "&aThe plugin configuration has been successfully reloaded."
  Use: "&fUse: &c/bloodeffect reload &8- &areload the plugin configuration."

bloodEffect:
  enable: true
  blockType: 'REDSTONE_BLOCK'

player:
  enable: true
  yOffset: 1.0

mob:
  enable: false
  yOffset: 0.5

projectile:
  enable: true
  yOffset: 1.5

crackShotEffect:
  enable: false

  player:
    enable: true
    yOffset: 1.0

  mob:
    enable: false
    yOffset: 0.5

  HeadShot:
    player:
      enable: true
      yOffset: 2.0
    mob:
      enable: true
      yOffset: 1.5

